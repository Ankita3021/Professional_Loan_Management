package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Loans;

public interface LoansRepository extends JpaRepository<Loans, Integer>{

}
