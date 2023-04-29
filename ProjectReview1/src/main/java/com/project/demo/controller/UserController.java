package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.UserDetails;
import com.project.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
    
    @GetMapping("/getuser")
    public List<UserDetails> getUserDetail()
    {
    	return us.getUserDetail();
    }
    
    
    @PostMapping("/saveuser")
    public UserDetails saveUserDetail(@RequestBody UserDetails u)
    {
    	return us.saveUserDetail(u);
    }

}
