package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.model.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Integer>{

}