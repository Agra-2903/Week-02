package HierarchicalInheritance.BankAccountTypes;

public class BankAccountTypes {
    public static void main(String[] args) {
        //creating object of superclass and subclass
        BankAccount bankAccount = new BankAccount(4478443, 70000);
        SavingsAccount savingsAccount = new SavingsAccount(6546377, 90000, 8);
        CheckingAccount checkingAccount = new CheckingAccount(646383,70000, 2000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(67466431, 4000000, true);
        //calling out their respective methods
        bankAccount.displayAccountType();
        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }

}
