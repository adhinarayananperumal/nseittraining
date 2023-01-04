package com.icici.loan.customer;

public interface Customer {
	
	String loanType="";
	
	void save();
	void getCustomer();
	void updateCustomer();
	void searchCustomer(String status,char cusTYpe);
}
