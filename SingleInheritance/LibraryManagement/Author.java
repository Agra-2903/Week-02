package SingleInheritance.LibraryManagement;

//Define a subclass Author with additional attributes name and bio
class Author extends Book{
    String name;
    String bio;

    public Author(String title, int year, String name, String bio){
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf("%-15s%-25s%n", name, bio);
    }
}
