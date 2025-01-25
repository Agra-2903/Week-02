package AssistedProblems.VehicleAndTransportSystem;

//Define a subclass MotorCycle and with its attribute mileage
class MotorCycle extends Vehicle{
    int milage;

    public MotorCycle(int speed, String type, int milage){
        super(speed, type);
        this.milage = milage;
    }

    void displayInfo(){
        System.out.println("===== Motorcycle =====");
        super.displayInfo();
        System.out.println("Milage: " + milage);
    }
}
