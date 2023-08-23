package com.loan.loanapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanRepayment {
	
	@Id
	private Integer loanRepaymentId;
	private Integer loanAmountRepayed;
	private String repaymentRecipt;
	
	
	public Integer getLoanRepaymentId() {
		return loanRepaymentId;
	}
	public void setLoanRepaymentId(Integer loanRepaymentId) {
		this.loanRepaymentId = loanRepaymentId;
	}
	public Integer getLoanAmountRepayed() {
		return loanAmountRepayed;
	}
	public void setLoanAmountRepayed(Integer loanAmountRepayed) {
		this.loanAmountRepayed = loanAmountRepayed;
	}
	public String getRepaymentRecipt() {
		return repaymentRecipt;
	}
	public void setRepaymentRecipt(String repaymentRecipt) {
		this.repaymentRecipt = repaymentRecipt;
	}
	public LoanRepayment(Integer loanRepaymentId, Integer loanAmountRepayed, String repaymentRecipt) {
		super();
		this.loanRepaymentId = loanRepaymentId;
		this.loanAmountRepayed = loanAmountRepayed;
		this.repaymentRecipt = repaymentRecipt;
	}
	public LoanRepayment() {
		super();
	}
	
	
	
	
}
