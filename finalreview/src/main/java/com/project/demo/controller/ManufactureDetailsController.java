package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.ManufactureDetails;
import com.project.demo.service.ManufactureDetailsService;

@RestController
public class ManufactureDetailsController {
	@Autowired
	ManufactureDetailsService ps;
	@GetMapping("/mid")
    public List<ManufactureDetails> get()
    {
 	   return ps.getDetails();
    }
    @PostMapping("/msaved")
    public ManufactureDetails postDetails(@RequestBody ManufactureDetails id)
    {
 	   return ps.postDetails(id);
    }

}
