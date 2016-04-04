package com.demo.java;

import java.util.function.Consumer;

public class ThisDemo {
    Integer integer = 1;

    void myMethod() {

//        Consumer consumer = new Consumer() {
//            Integer integer = 2;
//
//            @Override
//            public void accept(Object o) {
//                Integer integer1 = (Integer) o;
//                System.out.println(this.integer + integer1);
//            }
//        };

        Consumer consumer = num -> {
            System.out.println(this.integer + (Integer)num);
        };
        consumer.accept(0);

    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        thisDemo.myMethod();
    }
}
