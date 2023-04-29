package com.project.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Shirt;
import com.project.demo.service.ShirtService;

@RestController
public class ShirtController {
	@Autowired
	ShirtService ss;
	
	@GetMapping("/shirt")
	public List<Shirt> getall(){
		return ss.getall();
	}
	@PostMapping("/save")
	public Shirt saveDetail(@RequestBody Shirt s) {
		return ss.saveDetail(s);
	}
	@PutMapping("/update")
	public Shirt updateDetail(@RequestBody Shirt s) {
		return ss.updateDetail(s);
	}
	@DeleteMapping("/delete/{modelno}")
	public String deleteDetail(@PathVariable int modelno) { 
		ss.deleteDetail(modelno);
		return "The given data is deleted";
	}
	@GetMapping("/shirtdetail/{modelno}")
	public Optional<Shirt> findshirtId(@PathVariable int modelno){
		return ss.findshirtId(modelno);
	}
	@GetMapping("/sort/{field}")
	public List<Shirt>sortShirt(@PathVariable String field)
	{
		return ss.sortShirt(field);
	}
	@GetMapping("/paging/{offset}/{pagesize}")
	public List<Shirt>pagingShirt(@PathVariable int offset,@PathVariable int pagesize)
	{
		return ss.pagingShirt(offset,pagesize);
	}
	
	@GetMapping("/paging/{offset}/{pagesize}/{field}")
	public List<Shirt>pagingAndSortShirt(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
	{
		return ss.pagingAndSortShirt(offset,pagesize,field);
	}
	//http://localhost:8080/fetchPrefix?prefix=a
	@GetMapping("/fetch")
	public List<Shirt>fetchShirtByBrandPrefix(@RequestParam String prefix)
	{
		return ss.fetchShirtByBrand(prefix);
	}

	@GetMapping("/fetch1/")
	public List<Shirt>getShirtByColor(@RequestParam String color,@RequestParam String brand)
	{
		return ss.getShirtColor(color,brand);
	}
}
