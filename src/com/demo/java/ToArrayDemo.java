package com.demo.java;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Integer[] arrayOfInteger = integerList.stream().toArray(Integer[]::new);
        for (Integer integer : arrayOfInteger) {
            System.out.println(integer);
        }
    }
}
