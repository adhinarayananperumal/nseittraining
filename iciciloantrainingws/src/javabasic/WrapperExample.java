package javabasic;

public class WrapperExample {

	public static void main(String[] args) {

		
		String mark = "90";
		
		int markdet=Integer.parseInt(mark);
		System.out.println(markdet);
		
      int statusCode = 222;
      String sc = Integer.toString(statusCode);
      
      final int age=34;
      //age=90;
      
       EmployeePojo e = new EmployeePojo();
      e.empName="asewrwe";
      
      EmployeePojo e1 = new EmployeePojo();
      e=e1;
      
      
      
      

	}

}
