package com.collectionquestions;

/**
 * Created by Jagrati on 26-01-2019.
 */
public class Employee {
    String name;
    int empid;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                '}';
    }

    public Employee(String name, int empid) {
        this.name = name;
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}
