package vehiclerentalsystem;

// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate
// Add an abstract method calculateRentalCost(int days)
abstract class Vehicle {
    private String vehicleNumber;
    String type;
    private double rentalRate;

    public Vehicle(String number, String type, double rent){
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rent;
    }

    String getVehicleNumber(){
        return this.vehicleNumber;
    }

    void setVehicleNumber(String number){
        this.vehicleNumber = number;
    }

    double getRentalRate(){
        return this.rentalRate;
    }

    void setRentalRate(double rent){
        this.rentalRate = rent;
    }

    abstract void calculateRentalCost(int days);

    void displayDetails(){
        System.out.printf("%-12s%-10s%-5.2f%n", vehicleNumber, type, rentalRate);
    }
}
