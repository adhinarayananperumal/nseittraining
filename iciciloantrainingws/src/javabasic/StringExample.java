package javabasic;

public class StringExample {

	String empId = "nseit212";
	String cname = new String("Rahul");

	void display() {
		int l = empId.length();
		System.out.println("Length is .. " + l);
		char re = empId.charAt(2);
		System.out.println(re);
		System.out.println(empId.split("i"));
		empId.indexOf("e");
		String s = empId.substring(empId.indexOf("s"), empId.length());
		System.out.println(s);

		String ns = empId.replace("2", "A");
		System.out.println(ns);
	}

	boolean checkStringEquality(String n1, String n2) {

		if (n1.equals(n2)) {
			return true;
		} else {
			return false;
		}

	}
	
	String fullName;
	String firstName="Ravi";
	String lastName="Kumar";
	
	void displayFullName(){
		fullName=firstName + lastName;
		System.out.println(fullName);
	}
	
	
	StringBuilder fullName1=new StringBuilder();
	String firstName1="Ravi";
	String lastName1="Kumar";
	
	void displayFullNameBuilder(){
		fullName1.append(firstName1).append(lastName1);
		System.out.println(fullName);
	}

	
	
	
	
	

}
