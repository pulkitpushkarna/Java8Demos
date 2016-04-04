package com.demo.java;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
    public static void main(String[] args) {
        IntStream intStream= IntStream.of(1,2,3,4,5,6,7);
        System.out.println(intStream.min().getAsInt());
        intStream= IntStream.of(1,2,3,4,5,6,7);
        System.out.println(intStream.max().getAsInt());
        intStream= IntStream.of(1,2,3,4,5,6,7);
        System.out.println(intStream.average().getAsDouble());
        intStream= IntStream.of(1,2,3,4,5,6,7);
        System.out.println(intStream.sum());
    }
}
