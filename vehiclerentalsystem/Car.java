package vehiclerentalsystem;

// Create subclass Car with specific implementations of calculateRentalCost()
public class Car extends Vehicle implements Insurable{
    int seatCapacity;
    private double insurance;

    public Car(String number, String type, double rent, int capacity){
        super(number, type, rent);
        this.seatCapacity = capacity;
    }

    void calculateRentalCost(int days){
        System.out.println(getRentalRate() * days);
    }

    public void calculateInsurance(){
        this.insurance =  1000.00;
    }

    public double getInsuranceDetails(){
        return insurance;
    }
}
