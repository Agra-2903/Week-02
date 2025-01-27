package HierarchicalInheritance.BankAccountTypes;

//Define subclasses FixedDepositAccount unique attributes like  withdrawalLimit for CheckingAccount.
class CheckingAccount extends BankAccount{
    protected int withdrawalLimit;
    CheckingAccount(int accountNumber, int balance, int withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit =withdrawalLimit;
    }
    @Override
    public void displayAccountType(){
        super.displayAccountType();
        System.out.println("WithdrawalLimit is : " + this.withdrawalLimit);

    }
}
