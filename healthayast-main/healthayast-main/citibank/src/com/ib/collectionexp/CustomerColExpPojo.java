package com.ib.collectionexp;

public class CustomerColExpPojo implements Comparable{

	private String cusName;
	private int age;

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object cus) {
		
		// casting Objec  to pojo CustomerColExpPojo
		CustomerColExpPojo customer= (CustomerColExpPojo)cus;
		if(age==customer.age)  
			return 0;  
			else if(age>customer.age)  
			return -1;  
			else  
			return 1;  
			}  
	}


