// Book class created
class Book{
	// Declare attribute
	private String title;
	private String author;
	private int price;
	
	// Default constructor
	public Book(){
		title = "Atomic Habits";
		author = "James Clear";
		price = 170;
	}
	
	// Parameterized constructor
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.println("Book Name: " + title);
		System.out.println("Author of the book: " + author);
		System.out.println("Price: Rs. " + price);
	}
}


class DisplayBookDetails{
	public static void main(String[]args){
	    
		// Book objects
        Book book1 = new Book();
		Book book2 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", 184);
		
		System.out.println("=== Book-1 ===");
		book1.displayDetails();
		System.out.println("=== Book-2 ===");
		book2.displayDetails();
		
	}
}