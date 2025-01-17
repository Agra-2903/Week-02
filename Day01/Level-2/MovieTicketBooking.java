class MovieTicket{
	String movieName;
	int seatNumber;
	int price;
	
	public MovieTicket(String name, int num, int price){
		this.movieName = name;
		this.seatNumber = num;
		this.price = price;
	}
	
	void bookTicket(){
		if(price == 0){
			System.out.println("Seat already booked");
		}
		else{
			price = 0;
			System.out.println("Seat booked");
		}
	}
	
	void display(){
		System.out.println("Movie: " + movieName);
		System.out.println("Seat Number: " + seatNumber);
		System.out.println("Ticket Price: " + price);
		if(price == 0){
			System.out.println("Booking status: Booked");
		}
		else{
			System.out.println("Booking status: Not Booked");
		}
	}
}

class MovieTicketBooking{
	public static void main(String[]args){
		
		MovieTicket ticket1 = new MovieTicket("Pushpa 2", 1, 256);
		MovieTicket ticket2 = new MovieTicket("Pushpa 2", 2, 245);
		
		ticket1.bookTicket();
		ticket1.bookTicket();
		
		ticket1.display();
		ticket2.display();
	}
}