class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
	
    public void setBalance(double balance){
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber, String accountHolder, double balance){
        
        super(accountNumber, accountHolder, balance);
    }

    void display(){
        System.out.println("Account nummber: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

class BankAccountManagement{
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount(122367657, "Radheshyam", 5000000);
        obj.display();
    }
}