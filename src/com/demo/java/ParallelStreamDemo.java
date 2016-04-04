package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Integer findFirst1 = list.parallelStream().filter(e -> e > 4).findFirst().orElse(4);
        Integer findFirst2 = list.stream().parallel().filter(e -> e > 4).findFirst().orElse(4);
        System.out.println(findFirst1 + " " + findFirst2);

        int[] shortWords = new int[12];
        IntStream intStream = IntStream.range(1, 34);
//        intStream.parallel().forEach();


    }
}
