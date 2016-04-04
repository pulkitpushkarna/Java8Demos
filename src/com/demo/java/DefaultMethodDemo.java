package com.demo.java;

public class DefaultMethodDemo implements DummyInterface {
    public static void main(String[] args) {
        DummyInterface dummyInterface = new DefaultMethodDemo();
        dummyInterface.display();
        DummyInterface.staticDisplay();
    }
}
