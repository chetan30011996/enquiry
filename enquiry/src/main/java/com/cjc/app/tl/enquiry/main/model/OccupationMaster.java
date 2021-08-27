package com.cjc.app.tl.enquiry.main.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
@Entity
public class OccupationMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int occId;
	private String occType;
	private String occDesc;
	private String status;
	public int getOccId() {
		return occId;
	}
	public void setOccId(int occId) {
		this.occId = occId;
	}
	public String getOccType() {
		return occType;
	}
	public void setOccType(String occType) {
		this.occType = occType;
	}
	public String getOccDesc() {
		return occDesc;
	}
	public void setOccDesc(String occDesc) {
		this.occDesc = occDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
