package com.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.model.UserModel;
import com.loan.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;

	public List<UserModel> getall() {
		return ur.findAll();
	}

	public UserModel saveDetail(UserModel s) {
		return ur.save(s);
	}

	public UserModel updateDetail(UserModel s) {
		
		return ur.save(s);
	}

	public void deleteDetail(int loanid) {
		 ur.deleteById(loanid);
		
	}



}
