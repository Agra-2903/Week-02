package SingleInheritance.LibraryManagement;

//Define a superclass Book with attributes like title and publicationYear.
//Create a method displayInfo() to show details of the book and its author.
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int year){
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo(){
        System.out.println("================");
        System.out.printf("%-25s%-5d%n", title, publicationYear);
    }
}
