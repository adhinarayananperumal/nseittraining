package com.hdfc.corebankingnseit.service;

import java.util.List;

import com.hdfc.corebankingnseit.pojo.CustomerPojo;

public interface CustomerService {
	
	CustomerPojo save(CustomerPojo customerPojo);
	List<CustomerPojo> listCustomer();
	CustomerPojo getCustomer(int id);
	void update(CustomerPojo customerPojo);
	void delete(int cusId);
}
