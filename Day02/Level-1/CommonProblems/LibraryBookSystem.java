class Book{
	private String title;
	private String author;
	private int price;
	private boolean availability;
	
	public Book(){
		title = "Atomic Habits";
		author = "James Clear";
		price = 275;
		availability = true;
	}
	
	public Book(String title, String author, int price, boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	public Book(Book previousBook){
		this.title = previousBook.title;
		this.author = previousBook.author;
		this.price = previousBook.price;
		this.availability = previousBook.availability;
	}
	
	public void borrowingBook(){
		if(availability == true){
			System.out.println("Borrowing Book");
			availability = false;
		}
		else{
			System.out.println("Book not available");
		}
	}
	
	public void displayDetails(){
		System.out.println("Book Name: " + title);
		System.out.println("Author of the book: " + author);
		System.out.println("Price: Rs. " + price);
		if(availability == true){
			System.out.println("Book available");
		}
		else{
			System.out.println("Book not available");
		}
	}
}

class LibraryBookSystem{
	public static void main(String[]args){
		Book book1 = new Book();
		Book book2 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", 184, true);
		Book book3 = new Book(book2);
		
		book1.displayDetails();
		book2.displayDetails();
		book3.displayDetails();
		
		book1.borrowingBook();
		book1.borrowingBook();
		book2.borrowingBook();
		
		book1.displayDetails();
		book2.displayDetails();
		book3.displayDetails();
	}
	
}