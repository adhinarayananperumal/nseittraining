package com.ib.collectionexp;

public class CustomerEquHashCodeExpPojo {

	private String cusId;
	private String cusName;
	private int age;

	public int hashCode() {
		System.out.println("Inside hashcode Method..........");
		return cusId.hashCode();

	}

	public boolean equals(Object obj) {
		System.out.println("Inside equals Method............");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEquHashCodeExpPojo customerEquHashCodeExpPojo = (CustomerEquHashCodeExpPojo) obj;
		if (cusId != customerEquHashCodeExpPojo.cusId) {
			return false;
		}
		return true;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

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

}
