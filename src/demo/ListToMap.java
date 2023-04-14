package demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
   private int id;
   private String name;
   private String department;
   private String designation;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }
}
public class ListToMap {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Ram","CIB","Associate");
        Employee e2 = new Employee(4,"Arjun","GTI","VP");
        Employee e3 = new Employee(3,"Nikhil","AM","Associate");
        Employee e4 = new Employee(2,"Shyam","CB","Analyst");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Map<Integer, String> map = employees.stream().filter(e -> e.getDesignation().equals("Associate")).collect(
                Collectors.toMap(e -> e.getId(), e->e.getDesignation()));

        for(Map.Entry<Integer, String> val : map.entrySet())
        {
            System.out.println(val.getKey() + " "+ val.getValue());
        }


      //  System.out.println();
    }
}
