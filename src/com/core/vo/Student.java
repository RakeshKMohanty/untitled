package com.core.vo;

import java.util.List;

public class Student {

    private String firstname;
    private String lastname;
    private int rollno;
    private int schoolname;
    private String standard;
    private List<String> subject;

    public Student(String firstname, String lastname, int rollno, int schoolname,
                   String standard, List<String> subject) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.rollno = rollno;
        this.schoolname = schoolname;
        this.standard = standard;
        this.subject = subject;
    }




}
