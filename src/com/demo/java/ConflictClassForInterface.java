package com.demo.java;

public class ConflictClassForInterface implements ChildInterface1, ChildInterface2 {
    public void display() {
        System.out.println("ConflictClassForInterface");
    }

    public static void main(String[] args) {
        ConflictClassForInterface conflictClassForInterface = new ConflictClassForInterface();
        conflictClassForInterface.display();
    }
}
