package librarymanagementsystem;

// Implement an interface Reservable with methods reserveItem() and checkAvailability()
public interface Reservable {

    public boolean reserveItem(String borrower);

    public boolean checkAvailability();
}
