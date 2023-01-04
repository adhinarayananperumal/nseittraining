package expexample;

public class TaxTest {

	public static void main(String[] args) {

		try {
			TaxManagementImpl taxManagementImpl = new TaxManagementImpl();
			int tamount = taxManagementImpl.calculateTax(1000, 0);
			System.out.println("Tax payable is " + tamount);
			System.out.println("Exceution ends....");
		} catch (Exception e) {
			System.out.println("Error , please try again some time");
		}
	}

}
