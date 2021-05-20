package com.core.vo;

import java.util.List;

public class Employee {

   private int id;
   private String name;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public List<Adress> getAddresList() {
      return addresList;
   }

   public void setAddresList(List<Adress> addresList) {
      this.addresList = addresList;
   }

   public String getDepartmenString() {
      return departmenString;
   }

   public void setDepartmenString(String departmenString) {
      this.departmenString = departmenString;
   }

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
