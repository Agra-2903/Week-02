package HierarchicalInheritance.BankAccountTypes;

//Define a subclass FixedDepositAccount with attribute isFixedAccount
class FixedDepositAccount extends BankAccount{
    protected boolean isFixedAccount;
    FixedDepositAccount(int accountNumber, int balance, boolean isFixedAccount){
        super(accountNumber,balance);
        this.isFixedAccount =isFixedAccount;
    }
    @Override
    public void displayAccountType(){
        super.displayAccountType();
        System.out.println("FixedDepositAccount is : " + this.isFixedAccount);

    }
}

