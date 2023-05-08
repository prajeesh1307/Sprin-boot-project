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

import com.loan.model.LoanApplicationModel;
import com.loan.service.LoanApplicationService;



@RestController
public class LoanApplicationController {
	@Autowired
	LoanApplicationService us;
	@GetMapping("/loandetail")
	public List<LoanApplicationModel> getall(){
		return us.getall();
	}
	@PostMapping("/loansave")
	public LoanApplicationModel saveDetail(@RequestBody LoanApplicationModel s) {
		return us.saveDetail(s);
	}
	@PutMapping("/loanupdate")
	public LoanApplicationModel updateDetail(@RequestBody LoanApplicationModel s) {
		return us.updateDetail(s);
	}
	@DeleteMapping("/loandelete/{loanid}")
	public String deleteDetail(@PathVariable int loanid) { 
		us.deleteDetail(loanid);
		return "The given data is deleted";
	}

	

}
