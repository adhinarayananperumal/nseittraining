package com.icici.loan.abstractexp;

import com.icici.loan.customer.Customer;

abstract public class SalaryImpl {
	
	abstract void getSalary();
	
	void saveSalary(){
		System.out.println("getSalary");
	}

}
// TempEmployeeSalary
// PermanentEmployeeSalary