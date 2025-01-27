class Product{
	private static int discount = 30;
	private String productName;
	private int price;
	private final int productID;
	private int quantity;
	
	public Product(int id, String name, int price, int quantity){
	    this.id = id;
		this.productName = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	static void updateDiscount(){
		discount = 25;
	}
	
	public void displayDetails(){
		System.out.println("Product ID: " + productID);
		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
	
}

class ShoppingCartSystem{
	public static void main(String[]args){
		Product product1 = new Product(101, "Ghee", 100, 2);
		
		if(product1 instanceof Product){
			product1.displayDetails();
		}
	}
}