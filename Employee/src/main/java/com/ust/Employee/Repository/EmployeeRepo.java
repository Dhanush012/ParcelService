package com.ust.Employee.Repository;

import com.ust.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    List<Employee> findByVendorId(int vendorId);
}
