package com.cjc.app.tl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerLocalAddress;
	private String customerPerAddress;
	private String customerMobile;
	private String customerEmailId;
	private String customerUid;
	private String customerPan;
	private String customerOccupation;
	private String customerDob;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "occId")
	private OccupationMaster occupation;//foreign key
	private double customerYearlyIncome;
	private String status;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocalAddress() {
		return customerLocalAddress;
	}
	public void setCustomerLocalAddress(String customerLocalAddress) {
		this.customerLocalAddress = customerLocalAddress;
	}
	public String getCustomerPerAddress() {
		return customerPerAddress;
	}
	public void setCustomerPerAddress(String customerPerAddress) {
		this.customerPerAddress = customerPerAddress;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerUid() {
		return customerUid;
	}
	public void setCustomerUid(String customerUid) {
		this.customerUid = customerUid;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	public String getCustomerOccupation() {
		return customerOccupation;
	}
	public void setCustomerOccupation(String customerOccupation) {
		this.customerOccupation = customerOccupation;
	}
	public String getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}
	
	public double getCustomerYearlyIncome() {
		return customerYearlyIncome;
	}
	public void setCustomerYearlyIncome(double customerYearlyIncome) {
		this.customerYearlyIncome = customerYearlyIncome;
	}
	
	public OccupationMaster getOccupation() {
		return occupation;
	}
	public void setOccupation(OccupationMaster occupation) {
		this.occupation = occupation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
