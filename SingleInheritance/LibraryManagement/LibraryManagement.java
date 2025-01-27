package SingleInheritance.LibraryManagement;

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", 2000);
        Book book2 = new Author("Summer Story" , 2020, "Samar" , "Rom-Com");

        book1.displayInfo();
        book2.displayInfo();
    }
}
