package com.bjpowernode.java.collection;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        User u1 = new User("jack");
        User u2 = new User("jack");

        c.add(u1);

        // 没有重写equals，默认调用Object类的equals方法，使用==比较内存地址，false

        System.out.println(c.contains(u2)); //重写equals之后，true

        Integer x = new Integer(100);
        c.add(x);

        Integer y = new Integer(100);
        System.out.println(c.contains(y)); // true


        Collection cc = new ArrayList();
        String s1 = new String("hello");
        cc.add(s1);

        String s2 = new String("hello");
        cc.remove(s2);
        System.out.println(cc.size()); // 0
    }

}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
