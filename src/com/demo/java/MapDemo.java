package com.demo.java;


import java.util.Optional;
import java.util.stream.Stream;

public class MapDemo<I, L> {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> first = stream.map(element -> element * 2).findFirst();
        System.out.println(first.get());
    }
}
