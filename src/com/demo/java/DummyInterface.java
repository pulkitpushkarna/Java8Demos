package com.demo.java;

public interface DummyInterface {

    default void display() {
        System.out.println("hello world");
    }

    static void staticDisplay(){
        System.out.println("DummyInterface");
    }
}
