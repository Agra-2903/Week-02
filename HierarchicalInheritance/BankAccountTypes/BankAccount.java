package HierarchicalInheritance.BankAccountTypes;

// Model a banking system with different account types using hierarchical inheritance.
// BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
//Define a base class BankAccount with attributes like accountNumber and balance.
class BankAccount{
    protected int accountNumber;
    protected int balance;
    BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance= balance;
    }
    public void displayAccountType(){
        System.out.println("Account Number is : " + this.accountNumber);
        System.out.println("Balance is : " + this.balance);

    }
}
