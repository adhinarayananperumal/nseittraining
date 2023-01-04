package javabasic;

public class StringExampleTest {

	public static void main(String[] args) {

		
		StringExample s = new StringExample();
		s.display();
		boolean result = s.checkStringEquality("Ram", "Ram");
		
		System.out.println(result);
		
		s.displayFullName();
		
		s.displayFullNameBuilder();
		
		
		StringExample s3 = new StringExample();
		StringExample s4 = new StringExample();
		
		
		System.out.println(s3);
		System.out.println(s4);
		


	}
}
