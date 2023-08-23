package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Loans;

public interface BankService {
	Collection<Loans> getAllLoans();
}
