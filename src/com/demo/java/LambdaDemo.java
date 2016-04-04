package com.demo.java;


public class LambdaDemo {
    public static void main(String[] args) {

        DemoInterface demoInterface = a -> a;

        System.out.println(demoInterface.doSomething(1));
    }
}
