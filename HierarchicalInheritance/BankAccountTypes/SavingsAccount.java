package HierarchicalInheritance.BankAccountTypes;

//Define subclasses SavingsAccount with unique attributes like interestRate for SavingsAccount
class SavingsAccount extends BankAccount{
    protected int interestRate;
    SavingsAccount(int accountNumber, int balance, int interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountType(){
        super.displayAccountType();
        System.out.println("Interest Rate is : " + this.interestRate);

    }
}
