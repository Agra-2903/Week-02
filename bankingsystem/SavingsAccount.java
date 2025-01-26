package bankingsystem;

// Implemented subclass SavingsAccount with unique interest calculation
public class SavingsAccount extends BankAccount implements Loanable{
    private double interest;

    public SavingsAccount(int number, String name, double bal){
        super(number, name, bal);
    }

    public void calculateInterest(){
        interest = (getBalance() * 6.00) / (365.0 * 100.0);
    }

    public double getInterest(){
        return this.interest;
    }

    public void applyForLoan(double loanAmount){
        double eligibility = calculateLoanEligibility();
        if(loanAmount <= eligibility){
            System.out.println("Loan approved");
        }
        else{
            System.out.println("Not eligible for loan");
        }
    }

    public double calculateLoanEligibility(){
        return getBalance() * 5;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.printf("%-8.2f%n", interest);
    }
}
