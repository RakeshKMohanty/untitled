package com.core.operation;

import com.core.repository.Personrepository;
import com.core.vo.Department;
import com.core.vo.Employee;
import com.core.vo.Person;

//import java.util.*;
import java.util.*;
import java.util.function.Supplier;
import static java.util.stream.Collectors.*;

import java.util.stream.Collectors;
//import java.util.stream.Collectors.gr
import java.util.stream.Collectors.*;
import java.util.stream.Collector.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import static sun.net.InetAddressCachePolicy.get;

public class Streamoperation implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
    public int doGet(){
      return 2;
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
                .orElseGet(()->
                    getValue()
                         //null;

                ));
               // .orElse(2));
        System.out.println("Uppercase firstname : "+personlist.stream().map(person -> person.getFirstname())
                .map(String::toUpperCase).collect(Collectors.toList()));
        //personlist.stream().
        List<Person> modifiablelist = new ArrayList<>(personlist);
        // personlist.stream().dropWhile(person -> person.getFirstname().equalsIgnoreCase("Sunil")).
        // forEachOrdered(System.out::println); --> not working


       /* Collections.sort(modifiablelist, ( o1,  o2) ->
                //return o1.getFirstname().compareToIgnoreCase(o2.getFirstname());
                 o1.getAge()> o2.getAge()?1: o1.getAge()== o2.getAge()?0:-1


        );
*/
        modifiablelist.sort(Comparator.comparing(Person::getAge));
        //System.out.println("Sorted by age : ");
        //modifiablelist.forEach(System.out::println);
        System.out.println("group by : ");
        //Map<Integer, Set<String>> grouppersonbyAge =
                Collection<Set<String>> grouppersonbyAge = modifiablelist.stream().collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getFirstname, Collectors.toSet())))
                        .values();
        System.out.println(grouppersonbyAge);

       // Optional<Person> collect = modifiablelist.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge));

        //modifiablelist.stream().collect(Collectors.toMap(Person::getAge,List<Person>))
        //modifiablelist.stream().collect(Collectors.groupingBy(Person::getAge))
        //personlist.add(new Person("demofn","demoln",1));

        /*System.out.println("After adding element into the list : ");
        modifiablelist.stream().forEach(System.out::println);
        Collections.sort(personlist,new Sortperson());*/
        System.out.println("After sorting on the basis of age :");
        //modifiablelist.stream().forEach(System.out::println);


        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,null);
        mp.put(2,"b");
        System.out.println("map modified : "+mp.putIfAbsent(1,"b"));
        System.out.println(mp.keySet()+" values : "+mp.values());
        mp.forEach((k, v) -> System.out.print("key:"+k+" value:"+v+"\t") );
        System.out.println();

        //Map<Integer, Employee> employeemap = new HashMap<>();
        //modifiablelist.stream().collect(Collectors.toMap(Employee::getId,modifiablelist.get(modifiablelist.indexOf(modifiablelist.getId))));
        //public List<Person> putvalueforMap(List<Person> inputlist);
        //Map<String, String> collect = personlist.stream().collect(Collectors.toMap(Person::getFirstname, Person::toString));

        //System.out.println(mp.entrySet().stream().sorted(Integer.));
        //Stream<Map.Entry<Integer, String>> sorted =
       //System.out.println(mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).count(Collectors.toList()));
        //System.out.println(collect.forEach((k, v)-System.out::print());
        //collect.forEach((k,v)->System.out.println(k+","+v));

/*
        System.out.println("Grouping by person : " +
                // Map<String, Integer> collect =
                personlist.stream().collect(
                        groupingBy(
                                Person::getFirstname,
                                //collectingAndThen(Person::getLastname,String.join(Person::getAge.split("")))
                               // mapping(person -> person.getLastname().toUpperCase(), toList())
                                filtering(person -> person.getLastname().length()>5,
                                        collectingAndThen(Collectors.<Person>toList(), people -> people.forEach(person -> person.getLastname().toUpperCase())))

                                        //Collectors.toList())
                        )
                )
        );
*/

        System.out.println("List person with firstname : ");

                personlist.stream().
                        filter(person -> person.getAge()>25).
                        map(Person::getFirstname).
                        collect(Collectors.toList()).
                        forEach(System.out::println);

       List<Employee> employeelist = Personrepository.getListOfEmployee();
       doGroup(employeelist);
       //System.out.println("employee list by department group : "+
        Map<String, Integer> collect =
        employeelist.stream().collect(
                groupingBy(employee -> employee.getDepartmentList().getDepartmentname(),summingInt(Employee::getNoofleaves)
                        //mapping(Employee::getNoofleaves, toList())
                        ));
        //System.out.println( collect.values().stream().map(employees -> employees.stream().count()));
        //collect.entrySet().iterator();
        //while (collect.)
        collect.forEach((s, employees) -> System.out.println("Key : "+s+ " ,Values : "+employees));
        //.collect(Collectors.groupingBy(employee -> employee.getDepartmentList().getDepartmentname())));
    }

    private void doGroup(List<Employee> employeelist) {

        System.out.println("Employee with department ");

        System.out.println(employeelist.stream().collect(
                Collectors.toMap(Employee::getId,employee->{return employee.getDepartmentList();})
        ));
    }

    private Integer getValue() {

        return 2;
    }

    public void groupPersonistbyName(){
    }
}
