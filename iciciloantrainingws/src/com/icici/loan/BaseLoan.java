package com.icici.loan;

public class BaseLoan {

	String loanType = "";

	void displayLoanType() {
		System.out.println("Loan type is " + loanType);
	}
	

	String generateLoanId() {
		int loanIdLength = 9;

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(loanIdLength);

		for (int i = 0; i < loanIdLength; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}
