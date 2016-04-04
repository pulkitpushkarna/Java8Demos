package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        Optional optional = list.stream().findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Stream is empty");
        }

        Integer integer=list.stream().filter(num -> num > 7).findFirst().orElse(7);
        System.out.println(integer);
    }
}
