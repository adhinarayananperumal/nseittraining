package customer;

public class CustomerManagementClient {

	public static void main(String[] args) {

		
		CustomerManagementImpl c1 = new CustomerManagementImpl();
		c1.cusId=100;
		c1.displayValue();
		
		CustomerManagementImpl c2 = new CustomerManagementImpl();
		c2.displayValue();

	}

}
