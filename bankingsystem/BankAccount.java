package bankingsystem;

// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance
// Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract)
public abstract class BankAccount {

    // Use encapsulation to secure account details and restrict unauthorized access
    private final int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int number, String name, double bal){
        this.accountNumber = number;
        this.holderName = name;
        this.balance = bal;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public void setHolderName(String name){
        this.holderName = name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount entered");
        }
        else{
            System.out.println("Amount deposited");
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount <= balance){
            System.out.println("Amount withdraw complete");
            balance -= amount;
        }
        else{
            System.out.println("Invalid amount withdrawal");
        }
    }

    public abstract void calculateInterest();

    public void displayDetails(){
        System.out.printf("%-10d%-15s%-10.2f", accountNumber, holderName, balance);
    }
}
