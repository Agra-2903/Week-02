import java.util.*;

class Customer{
	private String accountHolder;
	private final int accountNumber;
	private int balance;
	
	public Customer(String name, int accNum, int bal){
		this.accountHolder = name;
		this.accountNumber = accNum;
		this.balance = bal;
	}
	
	void viewBalance(){
		System.out.printf("%-25s%-20d%-10d%n", accountHolder, accountNumber, balance);
	}
}

class Bank{
	private int bankId;
	String bankName;
	ArrayList<Customer> customers;
	
	public Bank(int id, String name){
		this.bankId = id;
		this.bankName = name;
		this.customers = new ArrayList<>();
	}
	
	void openAccount(String name, int accNum, int bal){
		Customer c = new Customer(name, accNum, bal);
		customers.add(c);
	}
	
	void displayCustomers(){
		System.out.println("==========" + bankName + "==========");
		for(Customer customer: customers){
			customer.viewBalance();
		}
	}
}

class BankAndAccountHolders{
	public static void main(String[]args){
		Bank bank1 = new Bank(534986, "ABC Bank");
		Bank bank2 = new Bank(845676, "XYZ Bank");
		
		bank1.openAccount("Akash", 6548353, 45160);
		bank1.openAccount("Aryan", 3546368, 56710);
		bank2.openAccount("Samar", 7454635, 64530);
		
		bank1.displayCustomers();
		bank2.displayCustomers();
	}
}