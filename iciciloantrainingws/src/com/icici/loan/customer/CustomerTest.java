package com.icici.loan.customer;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerManagementImpl c = new CustomerManagementImpl();
		c.getCustomer(45);
		
		
		Customer customer = new CustomerManagementImpl();
		customer.searchCustomer("t", 'e');
		
	}

}
