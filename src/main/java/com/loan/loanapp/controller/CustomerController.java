package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired 
	CustomerService customerService;
	
//	@GetMapping
//	public String addCustomer("/customer")
//	{
//		return "";
//	}
	
	@PostMapping ("/customer")
	public String addCustomer(@RequestBody Customer customer)
	{
		return "customer";
	}


}
