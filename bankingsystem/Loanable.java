package bankingsystem;

// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility()
public interface Loanable {
    public void applyForLoan(double loanAmount);

    public double calculateLoanEligibility();
}
