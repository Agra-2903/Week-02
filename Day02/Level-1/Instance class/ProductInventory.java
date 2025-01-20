class Product{
    private String productName;
    int price;
    
    static int totalProduct = 0;
    
    public Product(String name, int price){
        this.productName = name;
        this.price = price;
        totalProduct++;
    }
    
    public void displayProductDetails(){
        System.out.println("Product name: " + productName);
        System.out.println("Price: " + price);
    }
	
	static void displayTotalProducts(){
		System.out.println("Total no. of product: " + totalProduct);
	}
}

class ProductInventory{
	public static void main(String[]args){
		Product product1 = new Product("Oil", 90);
		Product product2 = new Product("Ghee", 120);
		Product product3 = new Product("Brush", 30);
		
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		
		Product.displayTotalProducts();
	}
}