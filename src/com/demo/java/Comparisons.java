package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Comparisons {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(new Employee("Vijay", 23, "Delhi"),
                new Employee("Ajay", 29, "Mumbai"));
        List sortedList = listOfEmployees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        sortedList.forEach(System.out::print);

        System.out.println(">>>>>>>>>>>>>");
        Optional optional = listOfEmployees.stream().max((e1, e2) -> e2.name.length() - e1.name.length());
        System.out.println(optional);
    }
}
