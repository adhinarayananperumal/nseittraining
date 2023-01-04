package com.icici.loan;

public class HomeLoanImpl extends BaseLoan{
	
	
	

	void save() {
		// generate loan id
		String loanId = "HOM" + generateLoanId();
		// connect to database and save loan details
		// send email
		// send sms
		System.out.println("Home Loan created successfully !!! ");
		System.out.println("Please note the loan id : " + loanId );
	}

}
