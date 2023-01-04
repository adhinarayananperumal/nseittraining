package javabasic;

public class PassByAddressTest {

	public static void main(String[] args) {

		EmployeePojo ep = new EmployeePojo();
		ep.empName="ravi";
		
		PassByAddress passByAddress = new PassByAddress();
		passByAddress.editEmployeeInfo(ep);
		System.out.println(ep.empName);
		
		int salary = 50000;
		passByAddress.changeSalary(salary);
		System.out.println(salary);
		
		StringBuilder cname=new StringBuilder("amazon");
		passByAddress.companyName(cname);
		System.out.println(cname);
	}
}
