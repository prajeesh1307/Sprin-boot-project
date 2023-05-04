package com.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.ManufactureDetails;
import com.project.demo.repository.ManufactureDetailsRepository;

@Service
public class ManufactureDetailsService {
	@Autowired
	ManufactureDetailsRepository mr;

	public List<ManufactureDetails> getDetails() {
		return mr.findAll();
	}

	public ManufactureDetails postDetails(ManufactureDetails id) {
		return mr.save(id);
	}

}
