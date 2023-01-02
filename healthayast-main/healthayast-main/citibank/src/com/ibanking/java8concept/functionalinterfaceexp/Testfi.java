package com.ibanking.java8concept.functionalinterfaceexp;

public class Testfi {

	public static void main(String[] args) {

		Loan loan = new GoldLoanImpl();
		loan.createLoan();

		Loan loanObj = () -> {
			System.out.println("li");
			return "GL1234567";
		};
		
		

		String loanId = loanObj.createLoan();

		System.out.println(loanId);
		
		
		
		Loan loanObj2 = () -> {
			System.out.println("li");
			return "eeeee";
		};
		
		String loanId1 = loanObj2.createLoan();
		System.out.println(loanId1);

	}

}
