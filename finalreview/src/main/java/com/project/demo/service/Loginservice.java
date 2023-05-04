package com.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Login;
//import com.project.demo.model.UserDetails;
import com.project.demo.repository.Loginrepository;

@Service
public class Loginservice {
	@Autowired
	Loginrepository lr;
	public List<Login> getUserDetail()
	{
		return lr.findAll();
	}

	public Login saveUser(Login u)
	{
	    return lr.save(u);
	}
	public String findUser(String username,String password)
	{
		String result="";
		Login u=lr.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		return result;
		
	}

}
