package AssistedProblems.VehicleAndTransportSystem;

//Define a subclass Truck and with its attribute loadCapacity
class Truck extends Vehicle{
    int loadCapacity;

    public Truck(int speed, String type, int capacity){
        super(speed, type);
        this.loadCapacity = capacity;
    }

    void displayInfo(){
        System.out.println("===== Truck =====");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}
