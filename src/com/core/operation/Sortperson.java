package com.core.operation;

import com.core.vo.Person;

import java.util.Comparator;

public class Sortperson implements Comparator<Person> {

    public Sortperson(){}


    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("Inside compare method");
        //return o1.getFirstname().compareTo(o2.getFirstname());
        return o1.getAge()-o2.getAge();
    }
}
