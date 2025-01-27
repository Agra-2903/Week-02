import java.util.*;

class Order{
	int orderId;
	private Customer customer;
	ArrayList<Product> products;
	double totalAmount = 0;
	
	public Order(int id, Customer c){
		this.orderId = id;
		this.customer = c;
		this.products = new ArrayList<>();
	}
	
	void addProduct(Product p){
		products.add(p);
		this.totalAmount += p.price;
	}
	
	void displayOrders(){
		for(Product product: products){
			System.out.printf("%-15s%-10.2f%n", product.product, product.price);
		}
		System.out.println("Order total amount: " + this.totalAmount);
	}
}

class Customer{
	private int customerId;
	String customerName;
	ArrayList<Order> orders;
	
	public Customer(int id, String name){
		this.customerId = id;
		this.customerName = name;
		this.orders = new ArrayList<>();
	}
	
	int getCustomerId(){
		return this.customerId;
	}
	
	void addOrders(Order o){
		orders.add(o);
	}
	
	void displayDetails(){
		System.out.println("Name: " + customerName + " - " + customerId);
		for(Order order: orders){
			System.out.println("---------" + order.orderId + "---------");
			order.displayOrders();
		}
	}
}

class Product{
	String product;
	double price;
	
	public Product(String product, double price){
		this.product = product;
		this.price = price;
	}
}

class ECommercePlatform{
	public static void main(String[]args){
		
		Customer cust1 = new Customer(1651, "Kushagra");
		
		Product prod1 = new Product("Ghee", 100.45);
		Product prod2 = new Product("Atta", 190);
		Product prod3 = new Product("Oil", 80.5);
		
		Order order1 = new Order(1, cust1);
		Order order2 = new Order(2, cust1);
		
		order1.addProduct(prod1);
		order1.addProduct(prod3);
		order2.addProduct(prod2);
		
		cust1.addOrders(order1);
		cust1.addOrders(order2);
		
		cust1.displayDetails();
	}
}