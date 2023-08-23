package com.loan.loanapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoanDisbursement {

	@Id
	private Integer loanDisbursementId;
	private Double loanDisbursementAmount;
	private String loanDisbursementDescription;
	private boolean loanStatus;
	public Double getLoanDisbursementAmount() {
		return loanDisbursementAmount;
	}
	@OneToMany
	private List<LoanRepayment> loanrepayment = new ArrayList<LoanRepayment>();

	
	
	public void setLoanDisbursementAmount(Double loanDisbursementAmount) {
		this.loanDisbursementAmount = loanDisbursementAmount;
	}
	public String getLoanDisbursementDescription() {
		return loanDisbursementDescription;
	}
	public void setLoanDisbursementDescription(String loanDisbursementDescription) {
		this.loanDisbursementDescription = loanDisbursementDescription;
	}
	public boolean isLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	public Integer getLoanDisbursementId() {
		return loanDisbursementId;
	}


	public void setLoanDisbursementId(Integer loanDisbursementId) {
		this.loanDisbursementId = loanDisbursementId;
	}


	public List<LoanRepayment> getLoanrepayment() {
		return loanrepayment;
	}
	


	public LoanDisbursement(Integer loanDisbursementId, Double loanDisbursementAmount,
			String loanDisbursementDescription, boolean loanStatus, List<LoanRepayment> loanrepayment) {
		super();
		this.loanDisbursementId = loanDisbursementId;
		this.loanDisbursementAmount = loanDisbursementAmount;
		this.loanDisbursementDescription = loanDisbursementDescription;
		this.loanStatus = loanStatus;
		this.loanrepayment = loanrepayment;
	}
	public LoanDisbursement() {
		super();
	}
	
	
	
}
