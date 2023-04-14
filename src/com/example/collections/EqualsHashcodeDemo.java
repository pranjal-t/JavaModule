package com.example.collections;

import java.util.HashMap;
import java.util.Map;

class Employee
{
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        Employee employee = (Employee) obj;

        if(this.name.equals(employee.name) && this.id==employee.id)
            return true;

        return false;
    }

    @Override
    public int hashCode()
    {
        return id;
    }

}
public class EqualsHashcodeDemo {

    public static void main(String args[])
    {
           Employee e1 = new Employee(12, "Rajesh");
           Employee e2 = new Employee(12, "Rajesh");

        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(e1,"Sales");
        employeeMap.put(e2,"IT");

        for(Employee e : employeeMap.keySet())
        {
            System.out.println(employeeMap.get(e));
        }

    }

}

/*
If two objects are equal, they MUST have the same hash code.
If two objects have the same hash code, it doesn't mean that they are equal.
Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable ... etc.
Overriding hashcode() alone doesn't force Java to ignore memory addresses when comparing two objects.

https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/#
 */
