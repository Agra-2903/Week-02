class Book{
	static String libraryName = "XYZ Library";
	protected String title;
	private String author;
	public final int ISBN;
	
	public Book(String title, String author, int isbn){
		this.title = title;
		this.author = author;
		this.ISBN = isbn;
	}
	
	public String getAuthorName(){
		return this.author;
	}
	
	public void setAuthorName(String name){
		this.author = name;
	}
	
	static void displayLibraryName(){
		System.out.println("Library Name: " + libraryName);
	}
}
class EBook extends Book{
	public EBook(String title,String author,int isbn){
		super(title, author, isbn);
	}
	
	public void displayDetails(){
		System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author name: " + getAuthorName());
	}
}

class LibraryManagementSystem{
	public static void main(String[]args){
		EBook book1 = new EBook("Atomic Habits", "James Clear", 564149);
		
		if(book1 instanceof Book){
			book1.displayLibraryName();
			book1.displayDetails();
		}
	}
}