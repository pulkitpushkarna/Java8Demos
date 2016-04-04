package com.demo.java;

public class MethodReference {
    static int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();

        MyFunctionalInterface functionalInterface = methodReference::sub;

        int c = functionalInterface.function(2, 3);

        System.out.println(c);
    }
}
