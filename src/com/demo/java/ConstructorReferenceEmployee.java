package com.demo.java;

public class ConstructorReferenceEmployee {
    public static void main(String[] args) {
        EmployeeInterface employeeInterface = Employee::new;
        Employee employee = employeeInterface.getInstance("Amar", 50, "Pune");
        System.out.println(employee);
    }
}
