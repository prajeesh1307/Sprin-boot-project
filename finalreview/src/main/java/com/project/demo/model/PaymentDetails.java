package com.project.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PaymentDetails {
	@Id
	private int barcodeid;
	private String Paymentmethod;
	private String Discount;
	PaymentDetails(){}
	public int getBarcodeid() {
		return barcodeid;
	}
	public void setBarcodeid(int barcodeid) {
		this.barcodeid = barcodeid;
	}
	public String getPaymentmethod() {
		return Paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		Paymentmethod = paymentmethod;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public PaymentDetails(int barcodeid, String paymentmethod, String discount) {
		super();
		this.barcodeid = barcodeid;
		Paymentmethod = paymentmethod;
		Discount = discount;
	}
	

}
