package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeService {

    private static HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
    private static int index = 2;

    static {
        Employee emp1 = new Employee(1, 2000, "Ion", "Cluj", "Digital", "Email1@gmail.com");
        Employee emp2 = new Employee(2, 3000, "Marius", "Cluj", "Digital", "Email2@gmail.com");
        employeeHashMap.put(emp1.getId(), emp1);
        employeeHashMap.put(emp2.getId(), emp2);
    }

    public static List<Employee> getAllEmployee() {
        return new ArrayList<>(employeeHashMap.values());
    }

    public static Employee getEmployee(int id) {
        return employeeHashMap.get(id);

    }

    public static Employee addEmployee(Employee emp) {
        index += 1;
        emp.setId(index);
        return employeeHashMap.put(emp.getId(), emp);
    }


    public static Employee updateEmployee(int id, Employee emp) {
        emp.setId(id);
        return employeeHashMap.put(id, emp);
    }

    public static Employee deleteEmployee(int id) {
        return employeeHashMap.remove(id);

    }
}