package com.core.repository;

import com.core.vo.Person;

import java.util.List;

public class Personrepository {

    public static List<Person> insertvalue() {

        List<Person> personList = List.of(
                new Person("Rajest", "nayak", 29),
                new Person("Amit", "pattnaok", 24),
                new Person("Gautam", "gipta", 20),
                new Person("Kamlesh", "singh", 26),
                new Person("Sunil", "Yadav", 25),
                new Person("Lavanya", "chatakal", 22),
                new Person("Bhuvanesh", "R", 30),
                new Person("Prakash", "mohanty", 21),
                new Person("Mahesh", "jena", 35),
                new Person("Mahesh", "jena", 35));
        return personList;

    }

}
