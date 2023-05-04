package com.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.PaymentDetails;
import com.project.demo.repository.PaymentDetailsRepository;

@Service
public class PaymentDetailsService {
	@Autowired
	PaymentDetailsRepository pr;
	public List<PaymentDetails> getDetails() {
		return pr.findAll();
	}

	public PaymentDetails postDetails(PaymentDetails id) {
		return pr.save(id);
	}

}
