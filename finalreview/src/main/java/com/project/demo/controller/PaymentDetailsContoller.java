package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.PaymentDetails;
import com.project.demo.service.PaymentDetailsService;

@RestController
public class PaymentDetailsContoller {
	@Autowired
	PaymentDetailsService ps;
	@GetMapping("/ids")
    public List<PaymentDetails> get()
    {
 	   return ps.getDetails();
    }
    @PostMapping("/saved")
    public PaymentDetails postDetails(@RequestBody PaymentDetails id)
    {
 	   return ps.postDetails(id);
    }

}
