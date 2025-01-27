import java.util.*;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	String getTitle(){
		return this.title;
	}
	
	String getAuthor(){
		return this.author;
	}
}

class Library{
	private int libraryId;
	String libraryName;
	ArrayList<Book> books;
	
	public Library(int id, String name){
	    this.libraryId = id;
		this.libraryName = name;
		this.books = new ArrayList<Book>();
	}
	
	void addBook(Book book){
		books.add(book);
	}
	
	void displayBooks(){
	    System.out.println("----------" + libraryName + "----------");
		for(Book book : books){
			System.out.printf("%-30s%-30s%n", book.getTitle(), book.getAuthor());
		}
	}
}

class LibraryAndBook{
	public static void main(String[]args){
		Book book1 = new Book("Atomic Habits", "James Clear");
		Book book2 = new Book("Rich Dad Poor Dad", "Robert T.Kiyosaki");
		Book book3 = new Book("Ramayan", "Ved Vayas");
		
		Library library1 = new Library(5664, "Life Learning Library");
		Library library2 = new Library(4826, "Mythological Library");
		
		library1.addBook(book1);
		library1.addBook(book2);
		library2.addBook(book3);
		
		library1.displayBooks();
		library2.displayBooks();
	}
}