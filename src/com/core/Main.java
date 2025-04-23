package com.core;

import com.core.operation.Streamoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  
    public static void main(String[] args) {

       List<Employee> employeeList = new ArrayList<>();

       employeeList.add(new Employee(1,100000,30));
        employeeList.add(new Employee(2,50000,25));
        employeeList.add(new Employee(3,40000,15));
        employeeList.add(new Employee(4,120000,10));
        employeeList.add(new Employee(5,120000,5));
      //  employeeList.add(new Employee(6,1000));

      // employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).forEach(System.out::println);
       employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge)).forEach(System.out::println);

       //employeeList.stream().collect(Collectors.groupingBy(Employee::Salary,C))



    }


}
