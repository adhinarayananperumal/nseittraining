package account;

import sms.SMSSender;

public class Transaction {
	
	
	void transferMoney(){
	
		// do transaction
		SMSSender s = new SMSSender();
		s.sendSMS();
	}

}
