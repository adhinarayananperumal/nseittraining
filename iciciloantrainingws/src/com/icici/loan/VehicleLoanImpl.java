package com.icici.loan;

public class VehicleLoanImpl extends BaseLoan {

	void save() {
		// generate loan id
		String loanId = "VEH" + generateLoanId();
		// connect to database and save loan details
		// send email
		// send sms
		System.out.println("Vehicle Loan created successfully !!! ");
		System.out.println("Please note the loan id : " + loanId);
	}

}
