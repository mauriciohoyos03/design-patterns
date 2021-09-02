package com.mauricio.design_patterns.creational.prototype;

public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException{
        Employees employees = new Employees();
        employees.loadData();
        System.out.println(employees.getEmployes());

        //Use the clone method to get the Employee object
        Employees employeesClone = (Employees) employees.clone();
        employeesClone.getEmployes().remove("Mauro");

        System.out.println(employeesClone.getEmployes());
    }
}
