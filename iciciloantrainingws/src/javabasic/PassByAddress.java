package javabasic;

public class PassByAddress {

	void editEmployeeInfo(EmployeePojo employeePojo) {
		employeePojo.age = 34;
		employeePojo.empName = "suman";
	}

	void changeSalary(int salary) {
		salary = 100000;
	}
	
	
	void companyName(StringBuilder cname){
		cname.append("sss");
	}

}
