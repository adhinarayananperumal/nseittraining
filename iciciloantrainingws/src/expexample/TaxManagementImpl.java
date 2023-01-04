package expexample;

public class TaxManagementImpl {

	public  int calculateTax(int tax, int taxRate) {
		
		int taxAmount = tax / taxRate;
		System.out.println("tax calculated");
		return taxAmount;
	}

}
