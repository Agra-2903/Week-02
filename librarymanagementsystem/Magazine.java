package librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable{
    private boolean isReserved;
    private String borrower;

    public Magazine(String id, String title, String author){
        super(id, title, author);
        this.isReserved = false;
        this.borrower = null;
    }

    public int getLoanDuration(){
        return 10;
    }

    public boolean reserveItem(String borrower){
        if (!isReserved) {
            isReserved = true;
            this.borrower = borrower;
            System.out.println("Magazine reserved for: " + borrower);
            return true;
        }
        System.out.println("Magazine is already reserved.");
        return false;
    }

    public boolean checkAvailability(){
        return !isReserved;
    }
}
