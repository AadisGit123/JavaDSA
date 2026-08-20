//Encapsulation
package com.java.oops.encapsulation;

import java.util.Scanner;

public class Employee {
    private String empName = "Rajath";
    private int empId = 3;

    Employee(String empName, int empId){
        this.empId = empId;
        this.empName = empName;
    }

    String getEmpName(){
        return empName;
    }

    int getEmpId(){
        return empId;
    }

    void setEmpName(String empName){
        this.empName = empName;
    }

    void setEmpId(int empId){
        this.empId = empId;
    }

    void printDetails(){
        System.out.println("Employee name: " + getEmpName());
        System.out.println("Employee ID: " + getEmpId());
    }
}

class Main{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aaditya", 4);
//        Employee emp2 = new Employee("Rajath", 3);
        emp1.printDetails();
//        emp2.printDetails();
        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getEmpId());
        emp1.setEmpName("Rahul");
        System.out.println(emp1.getEmpName());
    }
}




