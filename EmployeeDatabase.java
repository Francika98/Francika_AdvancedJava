import java.util.*;
public class EmployeeDatabase {
    public static void main(String[] args) {
        // Employee database code can be implemented here
        LinkedHashMap<Integer, String> employees = new LinkedHashMap<Integer, String>();
        employees.put(101,"Employee1");
        employees.put(102,"Employee2");
        employees.put(103,"Employee3");  
        // Adding a duplicate key to demonstrate update 
        employees.put(103,"Employee4");    
        
        employees.putIfAbsent(105, "Employee5");// Adding a new entry if key 105 is absent
            System.out.println("Entries of Employee details--> "+employees);
        employees.remove(102); // Removing entry with key 102
        employees.replace(103, "Employee6"); // Replacing value for key 103
        System.out.println("Entries of Employee details after removing key 102--> "+employees); 
        employees.clear(); // Clearing all entries
        System.out.println("Entries of Employee details after clear method--> "+employees);

    }
}
