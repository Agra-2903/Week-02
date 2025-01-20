// Person class created
class HotelBooking{
	// Declare attribute
	private String guestName;
	private String roomType;
	private int nights;
	
	// Default constructor
	public HotelBooking(){
		guestName = "Pratham";
		roomType = "Single-Bed room";
		nights = 3;
	}
	
	// Parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// Copy constructor
	public HotelBooking(HotelBooking previousBooking){
		this.guestName = previousBooking.guestName;
		this.roomType = previousBooking.roomType;
		this.nights = previousBooking.nights;
	}
	
	public void displayDetails(){
		System.out.println("Guest Name: " + guestName);
		System.out.println("Room Type: " + roomType);
		System.out.println("No. of nights staying: " + nights);
	}
}

class HotelBookingSystem{
	public static void main(String[]args){
	    
		// Person objects
		HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Kushagra", "Double-Bed room", 5);
		HotelBooking booking3 = new HotelBooking(booking2);
		
		System.out.println("===Booking-3 Details using Default Constructor===");
		booking1.displayDetails();
		System.out.println("===Booking-2 Details using Parameterized Constructor===");
		booking2.displayDetails();
		System.out.println("===Booking-3 Details using Copy Constructor===");
		booking3.displayDetails();
		
	}
}