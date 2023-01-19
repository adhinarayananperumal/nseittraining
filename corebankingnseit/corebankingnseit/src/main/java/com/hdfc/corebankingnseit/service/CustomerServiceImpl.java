package com.hdfc.corebankingnseit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hdfc.corebankingnseit.entity.Customer;
import com.hdfc.corebankingnseit.pojo.CustomerPojo;
import com.hdfc.corebankingnseit.repository.CustomerRepository;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public CustomerPojo save(CustomerPojo customerPojo) {

		System.out.println("Inside CustomerServiceImpl ....");
		System.out.println(customerPojo.getCid());
		System.out.println(customerPojo.getFirstName());
		System.out.println(customerPojo.getAge());
		
		Customer customer = new Customer();
		customer.setFirstName(customerPojo.getFirstName());
		customer.setAge(customerPojo.getAge());
		 
		Customer cus = customerRepository.save(customer);
		customerPojo.setCid(cus.getCid());
		
		return customerPojo;
	}
	
	public List<CustomerPojo> listCustomer() {
		List<CustomerPojo> customerPojoList = new ArrayList<CustomerPojo>();

		List<Customer> cus = customerRepository.findAll();

		for (Customer customer : cus) {
			CustomerPojo customerPojo = new CustomerPojo();
			customerPojo.setCid(customer.getCid());
			customerPojo.setFirstName(customer.getFirstName());
			customerPojo.setAge(customer.getAge());

			customerPojoList.add(customerPojo);
		}

		return customerPojoList;
	}
	
	public CustomerPojo getCustomer(int id) {
		Customer customer = customerRepository.getReferenceById(id);

		CustomerPojo customerPojo = new CustomerPojo();
		customerPojo.setCid(customer.getCid());
		customerPojo.setFirstName(customer.getFirstName());
		customerPojo.setAge(customer.getAge());

		return customerPojo;
	}

	@Override
	public void update(CustomerPojo customerPojo) {
		Customer customer = customerRepository.getReferenceById(customerPojo.getCid());
		customer.setFirstName(customerPojo.getFirstName());
		customer.setAge(customerPojo.getAge());
		System.out.println("updated successfully...........................");
	}
	
	@Override
	public void delete(int cusId) {
		customerRepository.deleteById(Integer.valueOf(cusId));
	}



}
