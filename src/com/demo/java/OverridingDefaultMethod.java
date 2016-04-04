package com.demo.java;

public class OverridingDefaultMethod implements DummyInterface {

    public void display() {
        DummyInterface.super.display();
        System.out.println("hello world child");
    }

    public static void main(String[] args) {
        DummyInterface dummyInterface = new OverridingDefaultMethod();
        dummyInterface.display();
    }
}
