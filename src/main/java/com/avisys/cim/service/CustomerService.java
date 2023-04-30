package com.avisys.cim.service;

import java.util.List;

import com.avisys.cim.entity.Customer;
import com.avisys.cim.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomersByFilter(String firstName, String lastName, String mobileNumber) {
        return customerRepository.findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndMobileNumber(firstName, lastName, mobileNumber);
    }

}