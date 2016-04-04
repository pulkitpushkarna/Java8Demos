package com.demo.java;

import java.util.Arrays;
import java.util.List;

public class CheckMatches {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(new Employee("Vijay", 23, "Delhi"),
                new Employee("Ajay", 29, "Mumbai"));

        System.out.println(listOfEmployees.stream().anyMatch(e -> e.getAge() > 31));
        System.out.println(listOfEmployees.stream().allMatch(e -> e.getAge() > 20));
        System.out.println(listOfEmployees.stream().noneMatch(e -> e.getAge() > 31));
        System.out.println(listOfEmployees.stream().filter(e->e.getAge()>12).count());
    }
}
