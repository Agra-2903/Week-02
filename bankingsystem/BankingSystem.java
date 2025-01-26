package bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount(5646556, "Vanisha", 654315);
        CurrentAccount curAcc = new CurrentAccount(6153456, "Kushagra", 234615);

        savAcc.calculateInterest();
        savAcc.displayDetails();
        savAcc.applyForLoan(1515456);

        curAcc.calculateInterest();
        curAcc.displayDetails();
        curAcc.applyForLoan(1541513);
    }
}
