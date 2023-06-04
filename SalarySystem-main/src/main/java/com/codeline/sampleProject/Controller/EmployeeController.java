package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee/create")

    public void saveEmployee (@RequestBody getEmployeeRequestObject employeeRequestObject)
    {
        createEmployee(employeeRequestObject);
    }
    @RequestMapping("employee/get")
    public List<Employee> getEmployee ()
    {
        return employeeService.getEmployees();
    }


        Employee employee = new Employee();
        employee.setName("Abdulaziz");
        employee.setGender("Male");
        employee.setSalary(1650.0);
        employee.setDepartment("IT");
        employee.setCompanyName("TechM");
        employee.setCreatedDate(new Date());
        employee.setIsActive(true);
        employeeService.saveEmployee(employee);
    }
}
