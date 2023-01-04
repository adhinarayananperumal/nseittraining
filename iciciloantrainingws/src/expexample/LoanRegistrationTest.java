package expexample;

public class LoanRegistrationTest {

	public static void main(String[] args){

		try {
		LoanRegistration l = new LoanRegistration();
		l.loanRegistration(10);
		System.out.println("End..");
		}catch(Exception e) {
			System.out.println("In catchblock..termination.");
		}
		
	}

}
