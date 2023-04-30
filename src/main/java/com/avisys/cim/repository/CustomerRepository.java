package com.avisys.cim.repository;

import com.avisys.cim.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();

    List<Customer> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndMobileNumber(String firstName, String lastName, String mobileNumber);
}