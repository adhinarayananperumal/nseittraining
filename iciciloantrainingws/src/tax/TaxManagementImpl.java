package tax;

public class TaxManagementImpl {
	
	String taxtype="corproate";

	double getGrossSalary(double ctc) {
		double taxAmount = ctc * 0.3;
		double grossSalary = ctc - taxAmount;
		return grossSalary;
	}

	void claculateTax(double anualSalary) {
		double taxAmount = 0;
		if (anualSalary > 500000) {
			taxAmount = anualSalary * 0.3;
		} else {
			taxAmount = anualSalary * 0.1;
		}

		System.out.println("The tax amount is " + taxAmount);
	}

}
