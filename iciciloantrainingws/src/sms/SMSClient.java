package sms;

public class SMSClient {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		
		SMSSender sms = new SMSSender();
		SMSSender sms1 = new SMSSender();

		sms.sendSMS();
		System.out.println("ended.....");
		sms.sendSMS();
        System.out.println("program ended successfully...");
	}

}
