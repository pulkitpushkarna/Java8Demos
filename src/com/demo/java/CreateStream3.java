package com.demo.java;

import java.util.stream.Stream;

public class CreateStream3 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Stream<Integer> integerStream = Stream.of(integers);
        integerStream.forEach(System.out::print);
    }
}
