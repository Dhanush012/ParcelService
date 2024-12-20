package com.ust.Employee.Service;


import com.ust.Employee.Repository.EmployeeRepo;
import com.ust.Employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getAllemp(){
        return repo.findAll();
    }

    public Employee addEmployee(Employee employee){
        return repo.save(employee);
    }

    public List<Employee> getEmployeeinfoByVendorinfoId(int vendorId) {
        return repo.findByVendorId(vendorId);
    }
}
