class Vehicle{
    static int registrationFee = 1000;

    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails(){
        System.out.println("Vehicle details");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Fee: " + registrationFee);
    }

    static void updateRegistrationFee(int newFee){
        registrationFee = newFee;
        System.out.println("Fee updated successfully. \nNew registration fee is: " + registrationFee);
    }
}

class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John", "Car");
        vehicle1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000);

    }
}
