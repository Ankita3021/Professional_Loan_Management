package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Loans;

public interface LoansService {
	Loans getLoansById(Integer id);
	Collection<Loans> getAllLoans();
}
