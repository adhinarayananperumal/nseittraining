package com.icici.loan;

public class PersonalLoanImpl extends BaseLoan {

	String loanType = "---";

	PersonalLoanImpl(String loanType) {
		super.loanType = loanType;
	}

	String generateLoanId() {
		System.out.println("sub");
		int loanIdLength = 3;

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(loanIdLength);

		for (int i = 0; i < loanIdLength; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

	void save() {
		// generate loan id
		String loanId = "PER" + generateLoanId();
		// connect to database and save loan details
		// send email
		// send sms
		System.out.println("Personal Loan created successfully !!! ");
		System.out.println("Please note the loan id : " + loanId);
	}

}
