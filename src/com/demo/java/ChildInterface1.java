package com.demo.java;


public interface ChildInterface1 extends DummyInterface {
    default void display() {
        System.out.println("ChildInterface1");
    }
}
