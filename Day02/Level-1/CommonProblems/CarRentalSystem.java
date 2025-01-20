class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    // constructor to initialize rental details
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    double calculateCost(){
        return rentalDays * 50;
    }

    void displayDetails(){
        System.out.println("Customer details");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }
}

class CarRentalSystem {
    public static void main(String[] args) {
        // Create a CarRental object
        CarRental carRental = new CarRental("John Doe", "Tata Nano", 5);
        carRental.displayDetails();
    }
}
