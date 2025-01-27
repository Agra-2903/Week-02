package HybridInheritance.VehicleManagementSystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        //creating objects of subclass
        PetrolVehicle petrolVehicle= new PetrolVehicle(70,"Honda");
        ElectricVehicle electricVehicle = new ElectricVehicle(80, "OLA");
        //calling out their respective methods
        petrolVehicle.refuel();
        electricVehicle.charge();
    }

}
