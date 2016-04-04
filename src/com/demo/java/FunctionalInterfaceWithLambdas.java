package com.demo.java;

public class FunctionalInterfaceWithLambdas {

    static void playWithFunctionalInterface(FunctionalInterface functionalInterface, int a, int b) {
        functionalInterface.doSomething(a, b);
    }

    public static void main(String[] args) {

        FunctionalInterface functionalInterface = (a, b) -> {
            System.out.println(a + b);
        };
        int a = 45, b = 12;
        playWithFunctionalInterface(functionalInterface, a, b);
    }
}
