package com.ust.Employee.Controller;

import com.ust.Employee.Service.EmployeeService;
import com.ust.Employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return service.getAllemp();
    }

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @GetMapping("vendor/{vendorid}")
    public ResponseEntity<List<Employee>> getAccountByBankId(@PathVariable("vendorid") int vendorId){
        return ResponseEntity.ok(service.getEmployeeinfoByVendorinfoId(vendorId));
    }
}
