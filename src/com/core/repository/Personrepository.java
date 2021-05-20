package com.core.repository;

import com.core.vo.Person;

import java.util.List;

public class Personrepository {

    public static List<Person> insertvalue() {

        List<Person> personList = List.of(
                new Person("Rajes", "nayak", 29),
                new Person("Amit", "pattnaik", 24),
                new Person("Gautam", "gupta", 20),
                new Person("Kamlesh", "singh", 26),
                new Person("Sunil", "Yadav", 25),
                new Person("Rohit", "Goyal", 22),
                new Person("Bhuvanesh", "R", 30),
                new Person("Prakash", "mohanty", 21),
                new Person("Mahesh", "jena", 33),
                new Person("Mahesh", "jena", 33));
        return personList;

    }

}
