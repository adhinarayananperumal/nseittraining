package com.icici.loan.customer;

public class CustomerManagementImpl implements Customer{

	 public void getCustomer() {
		System.out.println("Get Customer method default is called");
	}

	void getCustomer(String status) {
		System.out.println("Get Customer method with status is called");

	}

	void getCustomer(int cusId) {
		System.out.println("Get Customer method with id is called");
	}
	
	void getCustomer(String cusType,String role) {
		System.out.println("Get Customer method with id is called");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchCustomer(String status, char cusTYpe) {
     System.out.println("Search customer.......");		
	}


}
