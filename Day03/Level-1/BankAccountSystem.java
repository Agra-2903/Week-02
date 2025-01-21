class BankAccount{
	static String bankName = "ABC Bank";
	protected String accountHolderName;
	public final int accountNumber;
	private double balance;
	static int numberOfAccounts = 0;
	
	public BankAccount(String name, int accNum, double bal){
		this.accountHolderName = name;
		this.accountNumber = accNum;
		this.balance = bal;
		numberOfAccounts++;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	static void getTotalAccounts(){
		System.out.println("Total number of accounts in the bank is: " + numberOfAccounts);
	}
}

class SavingsAccount extends BankAccount{
	public SavingsAccount(String name, int accNum, double bal){
		super(name, accNum, bal);
	}
	
	void displayDetails(){
		System.out.println("Account Name: " + accountHolderName);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: " + getBalance());
	}
}

class BankAccountSystem{
	public static void main(String[]args){
		SavingsAccount account1 = new SavingsAccount("Akash", 156465, 1545);
		
		if(account1 instanceof BankAccount){
			account1.getTotalAccounts();
			account1.setBalance(1654);
			account1.displayDetails();
		}
	}
}