package com.zbz.controller;

import com.zbz.bean.Employee;
import com.zbz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ag
 * @date: 2019/3/14 10:29
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**增*/
    @GetMapping("/insert")
    public Employee insertEmployee(Employee employee) {
        employeeService.insertEmployee(employee);
        return employee;
    }
    /**
     * 查
     */
    @GetMapping("/query/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }
    /**改*/
    @GetMapping("/update")
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = employeeService.updateEmployee(employee);
        return employee1;
    }
    /**删*/
    @GetMapping("/delete/{id}")
    public Employee deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
        return new Employee();
    }

}
