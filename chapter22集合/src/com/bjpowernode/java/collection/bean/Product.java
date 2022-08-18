package com.bjpowernode.java.collection.bean;

import java.util.Objects;

public class Product {
    private int no;
    private String name;

    public Product(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Product() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return no == product.no && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
