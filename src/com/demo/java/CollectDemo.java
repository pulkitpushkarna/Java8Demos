package com.demo.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List filteredList = list.stream().filter(number -> number > 4).collect(Collectors.toList());

        System.out.println(filteredList);

        Set<Integer> filteredSet = list.stream().filter(number -> number > 4).collect(Collectors.toSet());

        System.out.println(filteredSet);

        Integer sum = list.stream().collect(Collectors.summingInt((Integer x) -> x));

        System.out.println(sum);

        Double average = list.stream().collect(Collectors.averagingInt((Integer x) -> x));

        System.out.println(average);

        Long counting = list.stream().collect(Collectors.counting());

        System.out.println(counting);

        List<String> stringList = Arrays.asList("abc", "def", "ghi", "jklm", "nopq");

        String joinedString = stringList.stream().filter(str -> str.length() > 3).collect(Collectors.joining(","));

        System.out.println(joinedString);

        Map map = list.stream().collect(Collectors.toMap(e -> e, e -> e + " Number" ));

        System.out.println(map);
    }
}
