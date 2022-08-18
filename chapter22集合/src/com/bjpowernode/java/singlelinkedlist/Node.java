package com.bjpowernode.java.singlelinkedlist;

/**
 *单链表的节点
 * 节点是单链表中的基本单元
 * 每个节点Node都有两个属性：
 *      一个是存储的数据
 *      一个是下一个节点的内存地址
 */
public class Node {

    // 数据
    Object element;
    // 下一个节点的内存地址
    Node next;

    public Node(){}

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }
}
