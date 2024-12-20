package com.ust.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    @Id
    public int empId;
    public String employeeName;
    public String employeeDepart;
    public int vendorId;

}
