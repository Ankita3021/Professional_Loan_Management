package com.loan.loanapp.service;

import org.springframework.stereotype.Component;

import com.loan.loanapp.entity.Admin;



//import java.util.Collection;
//
//import com.loan.loanapp.entity.Admin;
//import com.loan.loanapp.entity.Customer;
//import com.loan.loanapp.entity.Loans;
//@Component

public interface AdminService {
	Admin addAdmin(Admin newAdmin);
	Admin deleteAdminById(Integer id);
	Admin updateAdmin(Admin newAdmin);
	Admin getAdminById(Integer id);
//	//login
//	//

}
