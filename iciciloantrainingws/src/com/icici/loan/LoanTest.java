package com.icici.loan;

public class LoanTest {

	public static void main(String[] args) {

		VehicleLoanImpl vehicleLoanImpl = new VehicleLoanImpl();
		//vehicleLoanImpl.save();
		
		HomeLoanImpl homeLoanImpl = new HomeLoanImpl();
		//homeLoanImpl.save();
		
		PersonalLoanImpl personalLoanImpl = new PersonalLoanImpl("P");
		//personalLoanImpl.displayLoanType();

		personalLoanImpl.save();
	}

}
