package com.core.vo;

public class Department {



    private int id;
    private String departmentzone;
    private String departmentname;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentzone='" + departmentzone + '\'' +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public String getDepartmentzone() {
        return departmentzone;
    }

    public Department(int id, String departmentzone, String departmentname) {
        this.id = id;
        this.departmentzone = departmentzone;
        this.departmentname = departmentname;
    }

    public void setDepartmentzone(String departmentzone) {
        this.departmentzone = departmentzone;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }


   /* private String dev;
    private String test;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   /* public String getIT() {
        return IT;
    }

    public void setIT(String IT) {
        this.IT = IT;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }*/
}
