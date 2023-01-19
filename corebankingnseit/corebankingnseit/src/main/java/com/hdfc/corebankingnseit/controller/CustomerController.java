package com.hdfc.corebankingnseit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.corebankingnseit.pojo.CustomerPojo;
import com.hdfc.corebankingnseit.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/welcome")
	public String welcomeCall() {
		return "Welcome to Citi Bank";
	}

	@PostMapping(value = "/save")
	public CustomerPojo saveCustomer(@RequestBody CustomerPojo customerPojo) {

		System.out.println(customerPojo.getCid());
		System.out.println(customerPojo.getFirstName());
		System.out.println(customerPojo.getAge());

		customerService.save(customerPojo);
		return customerPojo;
	}
	
	@GetMapping("/list")
	public List<CustomerPojo> listCustomer() {
		List<CustomerPojo> listCustomer = customerService.listCustomer();
		return listCustomer;
	}
	
	@GetMapping("/get/{customerId}")
	public CustomerPojo getCustomer(@PathVariable("customerId") int customerId) {

		CustomerPojo customerPojo = customerService.getCustomer(customerId);

		return customerPojo;
	}

	@PutMapping(value = "/update")
	public CustomerPojo updateCustomer(@RequestBody CustomerPojo customerPojo) {

		customerService.update(customerPojo);
		customerPojo = customerService.getCustomer(customerPojo.getCid());
		return customerPojo;
	}
	
	@DeleteMapping(value = "/delete/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") int customerId) {
		customerService.delete(customerId);
		return "Customer deleted successfully with customer id " + customerId;
	}



}
