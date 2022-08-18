package com.bjpowernode.java.annotation4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public @interface MyAnnotation {
    int age();
    String[] email();
}
