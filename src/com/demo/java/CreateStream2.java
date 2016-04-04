package com.demo.java;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream2 {
    public static void main(String[] args) {
        List list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        list.stream().forEach(System.out::println);
    }
}
