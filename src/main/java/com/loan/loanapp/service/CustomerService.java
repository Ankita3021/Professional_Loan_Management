package com.loan.loanapp.service;

import java.util.Collection;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loans;

public interface CustomerService {
	Customer addCustomer(Customer newCustomer);
	Customer deleteCustomerById(Integer id);
	Customer updateCustomer(Customer newCustomer);
	Customer getCustomerById(Integer id);
	Collection<Customer> getAllCustomers();
	Collection<Loans> getAllLoans();

}
