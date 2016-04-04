package com.demo.java;

import java.util.function.IntConsumer;

public class IntConsumerDemo {
    public static void main(String[] args) {
        IntConsumer intConsumer=num-> System.out.println(num);
        intConsumer.accept(34);
    }
}
