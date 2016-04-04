package com.demo.java;

class Employee {
    String name;
    Integer age;
    String city;

    Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[name:" + name + ", age:" + age + ", city:" + city;
    }

    @Override
    public int hashCode() {
        return age.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Employee employee = (Employee) object;
        return age.equals(employee.age);
    }
}
