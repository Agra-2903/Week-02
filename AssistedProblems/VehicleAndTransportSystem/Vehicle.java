package AssistedProblems.VehicleAndTransportSystem;

//Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo()
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int speed, String type){
        this.maxSpeed = speed;
        this.fuelType = type;
    }

    void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
    }
}
