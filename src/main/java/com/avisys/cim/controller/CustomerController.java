
package com.avisys.cim.controller;

import com.avisys.cim.entity.Customer;
import com.avisys.cim.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/filter")
    public List<Customer> getCustomerByFilter(@RequestParam(required = false) String firstName,
                                              @RequestParam(required = false) String lastName,
                                              @RequestParam(required = false) String mobileNumber) {
        return customerService.getCustomersByFilter(firstName, lastName, mobileNumber);
    }
}