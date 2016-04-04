package com.demo.java;

import java.util.function.LongUnaryOperator;

public class LongUnaryDemo {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = num -> num + 1;
        System.out.println(longUnaryOperator.applyAsLong(1));
    }
}
