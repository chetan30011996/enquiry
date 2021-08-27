package com.cjc.app.tl.enquiry.main.serviceI;

import java.util.List;

import com.cjc.app.tl.enquiry.main.model.Enquiry;

public interface EnquiryServiceI {

	public String addEnquiryData(Enquiry e);
	
	public List<Enquiry> getAllEnquiryData();
}
