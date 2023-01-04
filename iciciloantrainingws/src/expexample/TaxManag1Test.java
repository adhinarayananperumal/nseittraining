package expexample;

public class TaxManag1Test {

	public static void main(String[] args) {

		try {
			Taxmanag1 taxManagementImpl = new Taxmanag1();
			int tamount = taxManagementImpl.calculateTax(1000, 10);
			System.out.println("Tax payable is " + tamount);
			System.out.println("Exceution ends....");
		} catch (Exception e) {
			System.out.println("Error , please try again some time");
		}
	}


}
