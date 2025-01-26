package vehiclerentalsystem;

// Create subclass Truck with specific implementations of calculateRentalCost()
public class Truck extends Vehicle implements Insurable{
    int loadCapacity;
    private double insurance;

    public Truck(String number, String type, double rent, int capacity){
        super(number, type, rent);
        this.loadCapacity = capacity;
    }

    void calculateRentalCost(int days){
        System.out.println(getRentalRate() * days);
    }

    public void calculateInsurance(){
        this.insurance =  1300.00;
    }

    public double getInsuranceDetails(){
        return insurance;
    }
}
