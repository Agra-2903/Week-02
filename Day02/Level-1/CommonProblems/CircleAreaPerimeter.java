// Circle class created
class Circle{
	private double radius;
	
	// Constructor chaining
	
	// Default constructor
	public Circle(){
		this(15); // Passing value to the parameterized constructor
	}
	
	// Parameterized constructor
	public Circle(double rad){
		this.radius = rad;
	}
	
	public double area(double rad){
		return Math.PI * rad * rad;
	}
	
	public double perimeter(double rad){
		return 2 * Math.PI * rad;
	}
	
	// Method to display circle details
	public void displayDetails(){
		System.out.println("Radius of the Circle: " + radius);
		System.out.println("Area of Circle: " + area(radius));
		System.out.println("Perimeter of Circle: " + perimeter(radius));
	}
}

class CircleAreaPerimeter{
	public static void main(String[]args){

        // Declare objects
        Circle circle1 = new Circle();
		
		System.out.println("=== Circle-1 ===");
		circle1.displayDetails();
	}
}