package com.project.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Shirt;
import com.project.demo.repository.ShirtRepository;

@Service
public class ShirtService {
	@Autowired
	ShirtRepository sr;
	
	public List<Shirt> getall(){
		return sr.findAll();
	}
	public Shirt saveDetail(Shirt s) {
		return sr.save(s);
	}
	public Shirt updateDetail(Shirt s)
	{
		return sr.save(s);
	}
	public void deleteDetail(int modelno) {
		sr.deleteById(modelno);
	}
	public Optional<Shirt> findshirtId(int modelno){
		return sr.findById(modelno);
	}

}
