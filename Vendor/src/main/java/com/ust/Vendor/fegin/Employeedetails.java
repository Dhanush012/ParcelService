package com.ust.Vendor.fegin;

import com.ust.Vendor.config.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="Employee-Services",url="http://localhost:9097/employee")
public interface Employeedetails {
    @GetMapping("/vendor/{vendorid}")
    List<Employee> findAllEmployeeByVendor(@PathVariable("vendorid") int id);

}