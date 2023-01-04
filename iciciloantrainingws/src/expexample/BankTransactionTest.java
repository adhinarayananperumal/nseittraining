package expexample;

import java.net.UnknownServiceException;

public class BankTransactionTest {

	public static void main(String[] args) {

		try {
			BankTransaction bt = new BankTransaction();

			try {
				bt.doMoneyTransfer();
			} catch (UnknownServiceException e) {

				System.out.println("...");
			}
			System.out.println("TRansaction success....");
		} catch (Exception e) {
			System.out.println("Transaction Failed");
			e.getMessage();
		    e.printStackTrace();
		}
	}
}