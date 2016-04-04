package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MapToIntDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "Hi", "I", "am", "good");
//        OptionalInt findFirst=stringList.stream().mapToInt(element -> element.length()).findFirst();
//        System.out.println(findFirst.getAsInt());
        IntStream intStream = stringList.stream().mapToInt(element -> element.length());
        System.out.println(intStream.min());
    }
}
