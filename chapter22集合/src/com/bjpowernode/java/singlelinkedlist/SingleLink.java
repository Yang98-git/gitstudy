package com.bjpowernode.java.singlelinkedlist;

public class SingleLink<E> {

    // 头节点
    Node header = null;

    int size = 0;

    public int size(){
        return size;
    }

    // 向链表中添加元素（向末尾添加）
    public void add(E data){
        /**
         * 创建一个新的节点对象
         * 让之前的单链表末尾节点next指向新节点对象
         */

        // 这个元素有可能是第一个
        if (header == null){
            // 说明还没有节点
            header = new Node(data,null);

        }else {
            // 头节点不是null
            // 找出当前末尾节点，让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
        size++;
    }

    /**
     * 查找当前末尾节点
     * @return
     */
    private Node findLast(Node node) {
        if (node.next == null){
            return node;
        }
        return findLast(node.next);
    }

    public void remove(Object data){}

    public void modify(Object data){}

    private int find(Object data){
        return 0;
    }
}
