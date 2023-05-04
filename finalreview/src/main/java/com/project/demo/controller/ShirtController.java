 
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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class ShirtController {
	@Autowired
	ShirtService ss;
	@Tag(name = "get",description = "display")
	@GetMapping("/shirt")
	public List<Shirt> getall(){
		return ss.getall();
	}
	@Tag(name = "post",description = "new entry")
	@PostMapping("/save")
	public Shirt saveDetail(@RequestBody Shirt s) {
		return ss.saveDetail(s);
	}
	@Tag(name = "put",description = "modify")
	@PutMapping("/update")
	public Shirt updateDetail(@RequestBody Shirt s) {
		return ss.updateDetail(s);
	}
	@Tag(name = "delete",description = "delete old record")
	@DeleteMapping("/delete/{modelno}")
	public String deleteDetail(@PathVariable int modelno) { 
		ss.deleteDetail(modelno);
		return "The given data is deleted";
	}
	@Tag(name = "get",description = "optional get")
	@GetMapping("/shirtdetail/{modelno}")
	public Optional<Shirt> findshirtId(@PathVariable int modelno){
		return ss.findshirtId(modelno);
	}
	@Tag(name = "sort",description = "sort")
	@GetMapping("/sort/{field}")
	public List<Shirt>sortShirt(@PathVariable String field)
	{
		return ss.sortShirt(field);
	}
	@Tag(name = "",description = "new entry")
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
	@GetMapping("/fetchsuffix")
	public List<Shirt>fetchShirtByBrandSuffix(@RequestParam String suffix)
	{
		return ss.fetchShirtByBran(suffix);
	}

	@GetMapping("/fetch1/")
	public List<Shirt>getShirtByColor(@RequestParam String color,@RequestParam String brand)
	{
		return ss.getShirtColor(color,brand);
	}
	@DeleteMapping("/deleteby/{color}")
	public String deleteByShirtColor(@PathVariable String color)
	{
		int result=ss.deleteShirtColor(color);
		if(result>0)
		{
			return "record deleted";
		}
		else
		{
			return "not deleted";
		}
	}
	@PutMapping("/updatebyname/{color}/{brand}")
	public String updateByShirtColor(@PathVariable String color,@PathVariable String brand)
	{
		int result=ss.updateShirtColor(color,brand);
		if(result>0)
		{
			return "upadated";
		}
		else
		{
			return "not updated";
		}
	}
}
