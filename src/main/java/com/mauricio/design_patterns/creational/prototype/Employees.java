package com.mauricio.design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/*
It would be easy to understand prototype design pattern with an example.
Suppose we have an Object that loads data from database. Now we need to modify this
data in our program multiple times, so it’s not a good idea to create the Object using
new keyword and load all the data again from database.

The better approach would be to clone the existing object into a new object and then
do the data manipulation.

*/

public class Employees implements Cloneable{
    private List<String> employees;

    public Employees(){
        employees = new ArrayList<>();
    }

    //read all employees from database and put into the list
    public void loadData() {
        employees.add("Mauro");
        employees.add("Juana");
        employees.add("Ana G");
    }

    public List<String> getEmployes() {
        return employees;
    }

    /*
    Notice that the clone method is overridden to provide a deep copy of the employees list.
    Here is the prototype design pattern example test program that will show the benefit
    of prototype pattern.

*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
