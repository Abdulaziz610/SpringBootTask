package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @RequestMapping("salary/create")
    public void saveSalary () {
        createSalary();
    }
    @RequestMapping("S/get")
    public List<Salary> getSalary () {
        return salaryService.getSalary();

    }
    public void createSalary() {

        Salary salary = new Salary();
        salary.setAmount(1200.0);
        salary.setBonus(4200.0);
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salary.setAllowances(150.0);
        salary.setOverTimeAmount(70.0);
        salary.setDeductions(150.00);
        salary.setCurrency("OMR");
        salary.setHealthCareContribution(50.0);
        salaryService.saveSalary(salary);
    }

}