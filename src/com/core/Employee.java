package com.core;


public class Employee {

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    private int id;
    private int salary;
    private int age;

    Employee(int id, int salary, int age){
    this.id = id;
    this.salary = salary;
    this.age = age;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }


}
