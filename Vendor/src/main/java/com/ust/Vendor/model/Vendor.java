package com.ust.Vendor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Arrays;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
@Entity
public class Vendor {
    @Id
    public int id;
    public String vendorName;
    public String vendorAddress;
    public String contactNumber;
    public String email;
    public String serviceType;
    public double rating;
    public int yearsInBusiness;
    public String operationalHours;
    public double deliveryCharge;
    public String[] supportedRegions;


    public Vendor() {
    }

    public Vendor(int id, String vendorName, String vendorAddress, String contactNumber, String email, String serviceType, double rating, int yearsInBusiness, String operationalHours, double deliveryCharge, String[] supportedRegions) {
        this.id = id;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.serviceType = serviceType;
        this.rating = rating;
        this.yearsInBusiness = yearsInBusiness;
        this.operationalHours = operationalHours;
        this.deliveryCharge = deliveryCharge;
        this.supportedRegions = supportedRegions;
    }

    public int getId() {
        return id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getRating() {
        return rating;
    }

    public int getYearsInBusiness() {
        return yearsInBusiness;
    }

    public String getOperationalHours() {
        return operationalHours;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public String[] getSupportedRegions() {
        return supportedRegions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYearsInBusiness(int yearsInBusiness) {
        this.yearsInBusiness = yearsInBusiness;
    }

    public void setOperationalHours(String operationalHours) {
        this.operationalHours = operationalHours;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public void setSupportedRegions(String[] supportedRegions) {
        this.supportedRegions = supportedRegions;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", vendorAddress='" + vendorAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", rating=" + rating +
                ", yearsInBusiness=" + yearsInBusiness +
                ", operationalHours='" + operationalHours + '\'' +
                ", deliveryCharge=" + deliveryCharge +
                ", supportedRegions=" + Arrays.toString(supportedRegions) +
                '}';
    }
}
