package com.core.operation;

import com.core.repository.Personrepository;
import com.core.vo.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Streamoperation implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }

    public void filterandsorting() {

        List<Person> personlist = Personrepository.insertvalue();

        personlist.forEach(System.out::println);
        System.out.println(personlist.stream().
                filter(person -> person.getFirstname().equalsIgnoreCase("Mahesh")).count());
        //personlist.stream().limit(5).forEach(System.out::println);
        //personlist.stream().forEachOrdered(System.out::println); ->not working
        System.out.println(personlist.stream()
                .max(Comparator.comparing(Person::getAge))
                .map(person -> person.getAge())
                .orElse(2));
        List<Person> modifiablelist = new ArrayList<>(personlist);
        // personlist.stream().dropWhile(person -> person.getFirstname().equalsIgnoreCase("Sunil")).
        // forEachOrdered(System.out::println); --> not working


       /* Collections.sort(modifiablelist, ( o1,  o2) ->
                //return o1.getFirstname().compareToIgnoreCase(o2.getFirstname());
                 o1.getAge()> o2.getAge()?1: o1.getAge()== o2.getAge()?0:-1


        );
*/
        modifiablelist.sort(Comparator.comparing(Person::getAge));
        System.out.println("group by : ");
        //Map<Integer, Set<String>> grouppersonbyAge =
                Set<Integer> grouppersonbyAge = modifiablelist.stream().collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getFirstname, Collectors.toSet())))
                        .keySet();
        System.out.println(grouppersonbyAge);

        //modifiablelist.stream().collect(Collectors.toMap(Person::getAge,List<Person>))
        //modifiablelist.stream().collect(Collectors.groupingBy(Person::getAge))
        //personlist.add(new Person("demofn","demoln",1));

        /*System.out.println("After adding element into the list : ");
        modifiablelist.stream().forEach(System.out::println);
        Collections.sort(personlist,new Sortperson());*/
        System.out.println("After sorting on the basis of age :");
        //modifiablelist.stream().forEach(System.out::println);

    }


}
