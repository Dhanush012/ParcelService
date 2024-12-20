package com.ust.Vendor.Service;

import com.ust.Vendor.Repository.Vendorrepo;
import com.ust.Vendor.config.Employee;
import com.ust.Vendor.config.FullResponse;
import com.ust.Vendor.fegin.Employeedetails;
import com.ust.Vendor.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Vendorservice {
    @Autowired
    private Vendorrepo repo;

    @Autowired
    private Employeedetails details;

    public Vendor addVendor(Vendor vendor) {
        return repo.save(vendor);
    }

    public List<Vendor> getAllVendors() {
        return repo.findAll();
    }

    public Vendor findVendorById(int id) {
        return repo.findById(id).orElse(null);
    }

    public FullResponse getVendorById(int id) {
        Optional<Vendor> vendor = repo.findById(id);
        List<Employee> p = details.findAllEmployeeByVendor(id);
        FullResponse fullResponse = new FullResponse();
        fullResponse.setVendorName(vendor.get().getVendorName());
        fullResponse.setVendorAddress(vendor.get().getVendorAddress());
        fullResponse.setContactNumber(vendor.get().getContactNumber());
        fullResponse.setEmail(vendor.get().getEmail());
        fullResponse.setOperationalHours(vendor.get().getOperationalHours());
        fullResponse.setSupportedRegions(vendor.get().getSupportedRegions());
        fullResponse.setEmployee(p);
        return fullResponse;
    }


}
