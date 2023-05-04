package com.project.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ManufactureDetails {
	@Id
	private int barcodeid;
	private String maddress;
	private String place;
	private int batchno;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Product_id")
	private PaymentDetails pd;
	ManufactureDetails(){}
	public int getBarcodeid() {
		return barcodeid;
	}
	public void setBarcodeid(int barcodeid) {
		this.barcodeid = barcodeid;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public PaymentDetails getPd() {
		return pd;
	}
	public void setPd(PaymentDetails pd) {
		this.pd = pd;
	}
	public ManufactureDetails(int barcodeid, String maddress, String place, int batchno, PaymentDetails pd) {
		super();
		this.barcodeid = barcodeid;
		this.maddress = maddress;
		this.place = place;
		this.batchno = batchno;
		this.pd = pd;
	}
	
}
