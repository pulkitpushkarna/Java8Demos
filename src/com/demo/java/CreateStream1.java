package com.demo.java;

import java.util.stream.Stream;

public class CreateStream1 {
    public static void main(String[] args) {
        Stream streamList = Stream.of("Hello", "World");
           streamList.forEach(word->{
               System.out.println(word);
           });
    }
}
