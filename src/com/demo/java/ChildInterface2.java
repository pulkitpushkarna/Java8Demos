package com.demo.java;

public interface ChildInterface2 {
    default void display() {
        System.out.println("ChildInterface1");
    }
}
