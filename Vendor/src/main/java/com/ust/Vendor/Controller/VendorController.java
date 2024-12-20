package com.ust.Vendor.Controller;

import com.ust.Vendor.Service.Vendorservice;
import com.ust.Vendor.config.FullResponse;
import com.ust.Vendor.model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private Vendorservice service;

    @PostMapping("/addvendor")
    public Vendor addVendor(@RequestBody Vendor vendor) {
        return service.addVendor(vendor);
    }

    @GetMapping("/findallvendors")
    public List<Vendor> getAllVendors() {
        return service.getAllVendors();
    }

    @GetMapping("/vendor/{vendorid}")
    public ResponseEntity<FullResponse> getVendorById(@PathVariable("vendorid") int id){
        return ResponseEntity.ok(service.getVendorById(id));
    }

    @GetMapping("/findvendorbyid/{id}")
    public Vendor findVendorById(@PathVariable int id) {
        return service.findVendorById(id);
    }
}