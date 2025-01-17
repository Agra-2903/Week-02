// Book class created
class MobilePhone{
	// Declare attribute
	String brand;
	String model;
	int price;
	
	public MobilePhone(String brand, String model, int price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	// Method to display characteristics of mobile phone
	public void displayDetails(){
		System.out.println("Brand Name: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: Rs. " + price);
	}
}

class MobilePhoneDetails{
	public static void main(String[]args){
	    
		// Book objects
        MobilePhone mp1 = new MobilePhone("Realme", "Narzo 50 Pro 5G", 17999);
		MobilePhone mp2 = new MobilePhone("Vivo", "A5 5G", 21999);
		
		System.out.println("=== MobilePhone-1 ===");
		mp1.displayDetails();
		System.out.println("=== MobilePhone-2 ===");
		mp2.displayDetails();
		
	}
}