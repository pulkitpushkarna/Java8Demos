package com.demo.java;

import java.util.Arrays;
import java.util.List;

public class IteratingList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        integerList.forEach(number -> System.out.println(number));
    }
}
