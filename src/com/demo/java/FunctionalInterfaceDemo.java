package com.demo.java;

public class FunctionalInterfaceDemo {


    static void playWithFunctionalInterface(FunctionalInterface functionalInterface, int a, int b) {
        functionalInterface.doSomething(a, b);
    }


    public static void main(String[] args) {

        FunctionalInterface functionalInterface = new FunctionalInterface() {
            @Override
            public void doSomething(int a, int b) {
                System.out.println(a - b);
            }
        };

        int a = 100, b = 59;

        playWithFunctionalInterface(functionalInterface, a, b);
    }
}
