package com.cjc.app.tl.enquiry.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.tl.enquiry.main.model.Enquiry;
import com.cjc.app.tl.enquiry.main.repository.EnquiryRepository;
import com.cjc.app.tl.enquiry.main.serviceI.EnquiryServiceI;
@Service
public class EnquiryServiceImpl implements EnquiryServiceI{

	@Autowired
	EnquiryRepository er;
	
	@Override
	public String addEnquiryData(Enquiry e) {
		er.save(e);
		return "Enquiry and Customer added successfully..";
	}

	@Override
	public List<Enquiry> getAllEnquiryData() {
	
		return er.findAll();
	}

}
