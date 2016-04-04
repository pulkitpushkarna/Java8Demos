package com.demo.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(new Employee("Vijay", 23, "Delhi"),
                new Employee("Ajay", 29, "Mumbai"), new Employee("Ajay", 29, "Calcutta"));
        List<Employee> distincteEmployeeList = listOfEmployees.stream().distinct().collect(Collectors.toList());
        System.out.println(distincteEmployeeList);
    }
}
