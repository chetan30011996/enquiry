package com.cjc.app.tl.enquiry.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.tl.enquiry.main.model.Customer;
import com.cjc.app.tl.enquiry.main.model.Enquiry;
import com.cjc.app.tl.enquiry.main.repository.CustomerRepository;
import com.cjc.app.tl.enquiry.main.serviceI.EnquiryServiceI;
@CrossOrigin("*")
@RestController
public class EnquiryController {
	
	@Autowired
	EnquiryServiceI es;
	
	@Autowired
	CustomerRepository cr;
	
	//Add Enquiry and Customer data method
	
	@PostMapping("/addenquiry")
	public String addEnquiry(@RequestBody Enquiry e)
	{
		return es.addEnquiryData(e);
	}
	
	//Get all Enquiry with customer data method
	
	@GetMapping("/getallenquiry")
	public List<Enquiry> getAllEnquiryData()
	{
		return es.getAllEnquiryData();
	}

	//Get all Customer Data Method
	
	@GetMapping("/getallcustomer")
	public List<Customer> getAllCustomerData()
	{
		return cr.findAll();
	}
}


