package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
        List<Integer> resultList=integerList.stream().limit(4).skip(1).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
