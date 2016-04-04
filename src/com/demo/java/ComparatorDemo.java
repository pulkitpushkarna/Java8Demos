package com.demo.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList();
        employeeArrayList.add(new Employee("Ajay", 29, "Delhi"));
        employeeArrayList.add(new Employee("Vijay", 31, "Mumbai"));
        employeeArrayList.add(new Employee("Suraj", 20, "Pune"));

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age - o2.age;
            }
        };

        System.out.print(employeeArrayList);
//        Collections.sort(employeeArrayList, comparator);
        Collections.sort(employeeArrayList, (Employee e1,Employee e2)->e1.age - e2.age);
        System.out.print(employeeArrayList);
    }
}
