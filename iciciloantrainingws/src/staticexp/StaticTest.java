package staticexp;

public class StaticTest {

	public static void main(String[] args) {

		StaticExample.getCustomerFullName(); 
		
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();

		s1.cn="Priya";
		
		System.out.println(s2.cn);
		
	}

}
