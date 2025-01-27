class Vehicle{
	private static int registrationFee = 5000;
	String ownerName;
	private String vehicleType;
	final int registrationNumber;
	
	public Vehicle(String name, String type, int regNum){
		this.ownerName = name;
		this.vehicleType = type;
		this.registrationNumber = regNum;
	}
	
	static void updateRegistrationFee(){
		registrationFee = 8000;
	}
	
	public void displayDetails(){
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration Number: " + registrationNumber);
		System.out.println("Registration Fee: " + registrationFee);
	}
}

class VehicleRegistrationSystem{
	public static void main(String[]args){
		Vehicle v1 = new Vehicle("Krish", "Maruti 800", 1654536);
		
		if(v1 instanceof Vehicle){
			v1.displayDetails();
		}
		
		Vehicle.updateRegistrationFee();
		
		v1.displayDetails();
	}
}