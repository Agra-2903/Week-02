import java.util.*;

// Item class created
class Item{
	private int itemCode;
	String itemName;
	int price;
	
	public Item(int code, String name, int price){
		this.itemCode = code;
		this.itemName = name;
		this.price = price;
	}
	
	// Method to display the list of items bought
	public void displayListItems(int numOfItem){
	    int total = numOfItem * price;
	    System.out.printf("%-15d%-15s%-20d%-15d%-15d%n", itemCode, itemName, price, numOfItem, total);
	}
}

class InventoryOfItems{
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		Item item1 = new Item(101, "Pen", 10);
		Item item2 = new Item(102, "Pencil", 5);
		Item item3 = new Item(103, "Eraser", 10);
		
		System.out.println("Enter number of pen");
		int numOfPen = input.nextInt();
		System.out.println("Enter number of pencil");
		int numOfPencil = input.nextInt();
		System.out.println("Enter number of eraser");
		int numOfEraser = input.nextInt();
		
		System.out.printf("%-15s%-15s%-20s%-15s%-15s%n", "Item code","Item Name", "Price of one item", "No. of Items", "Total cost");
		item1.displayListItems(numOfPen);
		item2.displayListItems(numOfPencil);
		item3.displayListItems(numOfEraser);
        		
        // Close the Scanner Object
		input.close();
	}
}