package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.model.UserModel;
import com.loan.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
	@GetMapping("/userdetail")
	public List<UserModel> getall(){
		return us.getall();
	}
	@PostMapping("/save")
	public UserModel saveDetail(@RequestBody UserModel s) {
		return us.saveDetail(s);
	}
	@PutMapping("/update")
	public UserModel updateDetail(@RequestBody UserModel s) {
		return us.updateDetail(s);
	}
	@DeleteMapping("/delete/{loanid}")
	public String deleteDetail(@PathVariable int loanid) { 
		us.deleteDetail(loanid);
		return "The given data is deleted";
	}

}
