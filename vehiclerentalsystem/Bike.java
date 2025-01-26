package vehiclerentalsystem;

// Create subclass Bike with specific implementations of calculateRentalCost()
public class Bike extends Vehicle implements Insurable{
    int mileage;
    private double insurance;

    public Bike(String number, String type, double rent, int mileage){
        super(number, type, rent);
        this.mileage = mileage;
    }

    void calculateRentalCost(int days){
        System.out.println(getRentalRate() * days);
    }

    public void calculateInsurance(){
        this.insurance =  600.00;
    }

    public double getInsuranceDetails(){
        return insurance;
    }
}
