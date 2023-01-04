package tax;

public class TaxManaementImplTest {

	public static void main(String[] args) {

		
		TaxManagementImpl t = new TaxManagementImpl();
		t.claculateTax(200000);
		
		double gsamount = t.getGrossSalary(750000);
		System.out.println("Grass salary " + gsamount);
	}

}
