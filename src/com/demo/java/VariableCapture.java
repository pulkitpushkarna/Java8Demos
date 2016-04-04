package com.demo.java;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class VariableCapture {
    public static void main(String[] args) {
        int x = 2;

        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6, 7);
        integerList.forEach(num -> {
            System.out.println("Hello!!!!!!!!!");
            System.out.println(num + x);
        });

//        integerList.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("Hello!!!!!!!!!");
//                System.out.println(integer + x);
//            }
//        });

    }
}
