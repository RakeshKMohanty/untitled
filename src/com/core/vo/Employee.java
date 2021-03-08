package com.core.vo;

import java.util.List;

public class Employee {

   private int id;
   private String name;
   private String company;
   private List<Adress> addresList;
   private String departmenString;

   public Employee(int id, String name, String company, List<Adress> addresList, String departmenString) {
      this.id = id;
      this.name = name;
      this.company = company;
      this.addresList = addresList;
      this.departmenString = departmenString;
   }




}
