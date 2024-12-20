package com.ust.Vendor.config;


import java.util.Arrays;
import java.util.List;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class FullResponse {
    public String vendorName;
    public String vendorAddress;
    public String contactNumber;
    public String email;
    public String operationalHours;
    public String[] supportedRegions;
    List<Employee> employee;

    public FullResponse() {
    }

    public FullResponse(String vendorName, String vendorAddress, String contactNumber, String email, String operationalHours, String[] supportedRegions, List<Employee> employee) {
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.operationalHours = operationalHours;
        this.supportedRegions = supportedRegions;
        this.employee = employee;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOperationalHours() {
        return operationalHours;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public String[] getSupportedRegions() {
        return supportedRegions;
    }

    public void setSupportedRegions(String[] supportedRegions) {
        this.supportedRegions = supportedRegions;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "FullResponse{" +
                "vendorName='" + vendorName + '\'' +
                ", vendorAddress='" + vendorAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", operationalHours='" + operationalHours + '\'' +
                ", supportedRegions=" + Arrays.toString(supportedRegions) +
                ", employee=" + employee +
                '}';
    }
}