package AssistedProblems.VehicleAndTransportSystem;

class VehicleAndTransportSystem {
    public static void main(String[] args) {

        // Creating object of each subclasses using reference of superclass
        Vehicle car = new Car(180, "CNG", 4);
        Vehicle truck = new Truck(150, "Diesel", 100);
        Vehicle mc = new MotorCycle(120, "Petrol", 50);

        // Declare vehicle array to store different vehicles
        Vehicle[] vehicles = {car, truck, mc};

        // Iterating through the array using for-each loop and displaying vehicle info using overrided displayInfo() method for each object
        for(Vehicle vehicle: vehicles){
            vehicle.displayInfo();
        }
    }
}
