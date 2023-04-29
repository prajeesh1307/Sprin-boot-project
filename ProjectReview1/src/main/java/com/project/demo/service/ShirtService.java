package com.project.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Sort.Direction;
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
	public List<Shirt> sortShirt(String field) {
		return sr.findAll(Sort.by(field));
		//return sr.findAll(Sort.by(Direction.DESC,field));
	}
	public List<Shirt> pagingShirt(int offset, int pagesize) {
		Pageable paging=PageRequest.of(offset, pagesize);
		Page<Shirt>shirtData= sr.findAll(paging);
		List<Shirt>shirtList=shirtData.getContent();
				return shirtList;
	}
	public List<Shirt> pagingAndSortShirt(int offset, int pagesize,String field) {
		Pageable paging=PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<Shirt>shirtData= sr.findAll(paging);
		List<Shirt>shirtList=shirtData.getContent();
				return shirtList;
	}
	public List<Shirt>fetchShirtByBrand(String prefix)
	{
		return sr.findByBrandStartingWith(prefix);
	}
	public List<Shirt>getShirtColor(String color,String brand){
		return sr.getShirtByColor(color,brand);
	}

}
