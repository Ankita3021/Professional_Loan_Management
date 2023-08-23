package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.entity.Admin;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping ("/admin")
	public String addCustomer(@RequestBody Admin admin)
	{
		return "admin";
	}
	

}

