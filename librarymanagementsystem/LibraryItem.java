package librarymanagementsystem;

// Use an abstract class LibraryItem with fields like itemId, title, and author
// Add an abstract method getLoanDuration() and a concrete method getItemDetails()
public abstract class LibraryItem {
    private final String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author){
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public String getItemId(){
        return this.itemId;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails(){
        System.out.printf("%-10s%-20s%-20s%n", itemId, title, author);
    }
}
