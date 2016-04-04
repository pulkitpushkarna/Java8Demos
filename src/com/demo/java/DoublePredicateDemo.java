package com.demo.java;

import java.util.function.DoublePredicate;

public class DoublePredicateDemo {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = num -> num > 3;
        System.out.println(doublePredicate.test(10.0));
    }
}
