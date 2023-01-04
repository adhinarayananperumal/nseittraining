package expexample;

public class LoanRegistration {

	void loanRegistration(int age) throws Exception{

		if (age > 18) {
			System.out.println("Registration success");
		} else {
			System.out.println("Sorry Registration failed");
			throw new InvalidAgeException();
		}

	}

}
