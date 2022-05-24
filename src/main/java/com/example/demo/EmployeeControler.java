package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeControler {


    @GetMapping("/employees")
    public List<Employee> getAllEmployee (){
        return EmployeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
public Employee getEmployee(@PathVariable int id ){
        return EmployeeService.getEmployee(id);

    }

    @PostMapping("/addEmployee")
    public Employee addEmployee (@RequestBody Employee employee) {
        return EmployeeService.addEmployee(employee);

    }

    @PutMapping ("/updateEmployee/{id}")

    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){

        return EmployeeService.updateEmployee(id,employee);

    }
    @DeleteMapping ("/deleteEmployee/{id}")

    public Employee deleteEmployee(@PathVariable int id ){
        return EmployeeService.deleteEmployee(id);
    }
}
