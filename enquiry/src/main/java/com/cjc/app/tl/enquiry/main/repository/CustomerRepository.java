package com.cjc.app.tl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.tl.enquiry.main.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
