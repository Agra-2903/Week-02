package HybridInheritance.VehicleManagementSystem;

//Define a superclass Vehicle with attributes like maxSpeed and model.
public class Vehicle{
    protected int maxSpeed;
    protected String model;
    Vehicle(int maxSpeed, String  model){
        this.maxSpeed= maxSpeed;
        this.model= model;
    }
}

