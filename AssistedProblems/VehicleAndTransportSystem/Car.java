package AssistedProblems.VehicleAndTransportSystem;

//Define a subclass Car and with its attribute seatCapacity
class Car extends Vehicle{
    int seatCapacity;

    public Car(int speed, String type, int capacity){
        super(speed, type);
        this.seatCapacity = capacity;
    }

    void displayInfo(){
        System.out.println("===== Car =====");
        super.displayInfo();
        System.out.println("Number of seat: " + seatCapacity);
    }
}
