package javabasic;

public class ConstructorExample {

	String cusName;
	int age;
	String gender;
	boolean status;
	char companyType = 'm';

	ConstructorExample() {
		System.out.println("Inside default constructor ");
	}

	ConstructorExample(String cusName, String gender) {
		this.cusName = cusName;
	}

	void display() {
		System.out.println("customer name is " + cusName);
		System.out.println("customer status is " + status);
	}
}
