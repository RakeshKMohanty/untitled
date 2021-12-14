package com.core.repository;

import com.core.vo.Department;
import com.core.vo.Employee;
import com.core.vo.Person;

import java.util.List;

public class Personrepository {

    public static List<Person> insertvalue() {

        List<Person> personList = List.of(
                new Person("Amit", "nayak", 29),
                new Person("Amit", "pattnaik", 24),
                new Person("Gautam", "gupta", 20),
                new Person("Gautam", "singh", 26),
                new Person("Sunil", "Yadav", 25),
                new Person("Sunil", "Goyal", 22),
                new Person("Sunil", "R", 30),
                new Person("Prakash", "mohanty", 21),
                new Person("Mahesh", "jena", 33),
                new Person("Mahesh", "jena", 33));
        return personList;


    }

    public static List<Employee> getListOfEmployee(){
        List<Employee> employeelist = List.of(
                new Employee(1,"Rakesh",4,new Department(11,"East","IT")),
                new Employee(2,"Jagruti",2,new Department(22,"west","Admin")),
                new Employee(3,"Goutam",3,new Department(33,"South","Test")),
                new Employee(4,"Param",2,new Department(44,"north","IT")),
                new Employee(5,"Goutam",3,new Department(55,"South","Test")),
                new Employee(6,"Nehal",3,new Department(66,"South","IT"))
        );
        return employeelist;
    }

}
