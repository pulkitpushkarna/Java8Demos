package com.demo.java;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo2 {
    public static void main(String[] args) {
        Stream<List<Integer>> integerListStream = Stream.of(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

//        System.out.println(integerListStream.collect(Collectors.toList()));
        System.out.println(integerListStream.flatMap(Collection::stream).collect(Collectors.toList()));
    }
}
