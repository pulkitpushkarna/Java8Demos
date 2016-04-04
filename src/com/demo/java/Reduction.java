package com.demo.java;


import java.util.stream.IntStream;

public class Reduction {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(2, 100);
        System.out.println(intStream.reduce(1, (n1, n2) -> n1 + n2));

    }
}
