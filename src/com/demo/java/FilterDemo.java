package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        Optional<Integer> integerOptional = stream.filter(element -> element > 3).findFirst();
        System.out.println(integerOptional.get());
    }
}
