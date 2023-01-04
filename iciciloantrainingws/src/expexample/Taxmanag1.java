package expexample;

public class Taxmanag1 {

	public  int calculateTax(int tax, int taxRate) {
		
		try {
		int taxAmount = tax / taxRate;
		System.out.println("tax calculated");
		}catch(Exception e) {
			System.out.println("Problem happened");
			// send mail to production support team
			System.out.println("Mail sent");
		}finally {
			System.out.println("Finally block executed");
		}
		return taxRate;
	}

}
