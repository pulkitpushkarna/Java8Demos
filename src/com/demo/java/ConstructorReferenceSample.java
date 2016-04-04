package com.demo.java;


public class ConstructorReferenceSample {
    public static void main(String[] args) {
       ConstructorReferenceInterface constructorReferenceInterface = String::new;
        String str=constructorReferenceInterface.myMethod(new char[]{'a', 'b', 'c', 'd'});
        System.out.println(str);
    }
}
