class BankAccount{
	String accountHolder;
	private int accountNumber;
	private int balance;
	
	public BankAccount(String name, int accNum, int balance){
		this.accountHolder = name;
		this.accountNumber = accNum;
		this.balance = balance;
	}
	
	void depositAmount(int amount){
	    System.out.println(amount + " deposited in the account");
		balance += amount;
	}
	
	void withdrawAmount(int amount){
		if(amount <= balance){
			System.out.println(amount + " debited from the account");
		    balance -= amount;
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
	
	void displayStatus(){
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Current balance: " + balance);
	}
}
class ATMSimulator{
	
	public static void main(String[]args){
		BankAccount acc1 = new BankAccount("Sameer", 1051305, 157340);
		BankAccount acc2 = new BankAccount("Nayara", 1436551, 156852);
		BankAccount acc3 = new BankAccount("Aman", 1564611, 100856);
		
		System.out.println("Depositing 10000 in Sameer account");
		acc1.depositAmount(10000);
		
		System.out.println("Withdrawing 15000 from Aman account");
		acc3.withdrawAmount(15000);
		
		acc1.displayStatus();
		acc2.displayStatus();
		acc3.displayStatus();
	}
}