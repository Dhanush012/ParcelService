package com.ust.Vendor.config;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data

public class Employee{

    public int id;
    public String employeeName;
    public String employeeDepart;
    public int vendorId;//fk

    public Employee(int id, String employeeName, String employeeDepart, int vendorId) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeDepart = employeeDepart;
        this.vendorId = vendorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepart() {
        return employeeDepart;
    }

    public void setEmployeeDepart(String employeeDepart) {
        this.employeeDepart = employeeDepart;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDepart='" + employeeDepart + '\'' +
                ", vendorId=" + vendorId +
                '}';
    }

    public Employee() {
    }
}