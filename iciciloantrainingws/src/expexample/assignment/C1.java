package expexample.assignment;

public class C1 {

	public static void main(String[] args) {

		try {
		C2 c2 = new C2();
		c2.registration();
		System.out.println("Registration Successfull !!!!");
		}catch(Exception e) {
			System.out.println("Registration failed");
		}
	}

}
