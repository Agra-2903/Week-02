class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    void displayResult(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displaying(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Title: " + this.title);
        System.out.println("Author name: " + getAuthor());        
    }
}

class BookLibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("1234567890", "Book Title", "John Doe");
        book.displayResult();
        System.out.println();
        book.setAuthor("Jane Doe");
        book.displayResult();
        System.out.println();

        EBook ebook = new EBook("9876543210", "EBook Title", "Ankur");
        ebook.displaying();
    }
}
