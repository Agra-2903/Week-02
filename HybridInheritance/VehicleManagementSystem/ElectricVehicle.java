package HybridInheritance.VehicleManagementSystem;

//Define subclasses ElectricVehicle and it should implement charge() method.
class ElectricVehicle extends Vehicle{
    ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed,model);
    }
    public void charge(){
        System.out.println("Electric vehicle is charging");
    }
}

