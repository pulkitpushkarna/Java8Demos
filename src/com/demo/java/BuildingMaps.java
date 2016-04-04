package com.demo.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingMaps {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(new Employee("Vijay", 23, "Delhi"),
                new Employee("Ajay", 29, "Mumbai"), new Employee("Ajay", 29, "Calcutta"));

        System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(emp -> emp.age)));
        System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(emp -> emp.name)));
        System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(emp -> emp.age, Collectors.toSet())));
        System.out.println(listOfEmployees.stream().collect(Collectors.partitioningBy(emp -> emp.age == 29)));
        System.out.println(listOfEmployees.stream().collect(Collectors.partitioningBy(emp -> emp.name.equals("Ajay"))));
        System.out.println(listOfEmployees.stream().collect(Collectors.partitioningBy(emp -> emp.age == 29, Collectors.toSet())));
    }
}