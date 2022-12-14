package com.bjpowernode.java.collection.bean;

import java.util.Objects;

public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 没有重写hashCode和equals
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Student))
            return false;
        if (obj == this) return true;
        Student s = (Student) obj;
        return s.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
