package vehiclerentalsystem;

class VehicleRentalSystem {
    public static void main(String[] args) {

        // Creating objects of the subclasses
        Car car1 = new Car("MP04KJ5634", "Petrol", 500, 4);
        Bike bike1 = new Bike("MP40VI1654", "Electric", 100, 40);
        Truck truck1 = new Truck("MP19IV6544", "Diesel", 800, 1500);

        // Display details and calculate rental cost and insurance of the vehicles
        car1.displayDetails();
        car1.calculateRentalCost(10);
        car1.calculateInsurance();
        System.out.println("Insurance amount: " + car1.getInsuranceDetails());

        bike1.displayDetails();
        bike1.calculateRentalCost(4);
        bike1.calculateInsurance();
        System.out.println("Insurance amount: " + bike1.getInsuranceDetails());

        truck1.displayDetails();
        truck1.calculateRentalCost(8);
        truck1.calculateInsurance();
        System.out.println("Insurance amount: " + truck1.getInsuranceDetails());
    }
}
