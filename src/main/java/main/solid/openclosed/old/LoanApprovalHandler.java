package main.solid.openclosed.old;

public class LoanApprovalHandler {
	public void approveLoan(PersonalLoanValidator validator) {
		if (validator.isValid()) {
			//Process the loan.
		}
	}

	public void approveVehicleLoan(VehicleLoanValidator validator) {
		if (validator.isValid()) {
			//Process the loan.
		}
	}
	// Method for approving other loans.
}
