package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.Login;
import com.project.demo.service.Loginservice;

@RestController
public class LoginController {
	@Autowired
	Loginservice ls;
	@GetMapping("/getdetail")
	 public List<Login> getUserDetail()
    {
    	return ls.getUserDetail();
    }
	
	
	@PostMapping("/checkLogin")
	public String validatingUser(@RequestBody Login u)
	{
		return ls.findUser(u.getUsername(),u.getPassword());
	}
	
    @PostMapping("/addUser")
    public String getDetails(@RequestBody Login u)
    {
         ls.saveUser(u);
         return "saved";
    }

}
