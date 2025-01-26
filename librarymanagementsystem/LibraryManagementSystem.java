package librarymanagementsystem;

import java.util.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of LibraryItem objects
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        // Add items to the library
        libraryItems.add(new Book("BK001", "The Great Gatsby", "F. Scott Fitzgerald"));
        libraryItems.add(new Magazine("MG001", "National Geographic", "National Geographic Society"));
        libraryItems.add(new DVD("DV001", "Inception", "Christopher Nolan"));

        for (LibraryItem item : libraryItems) {
            System.out.println("----------------------------------");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;

                System.out.println("Available for reservation: " + reservable.checkAvailability());

                if (reservable.checkAvailability()) {
                    reservable.reserveItem("John Doe");
                }
            }
        }
    }
}
