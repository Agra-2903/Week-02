import java.util.*;

// Circle class created
class Circle{
	double radius;
	
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
        Circle circle1 = new Circle(15);
		Circle circle2 = new Circle(13);
		
		System.out.println("=== Circle-1 ===");
		circle1.displayDetails();
		System.out.println("=== Circle-2 ===");
		circle2.displayDetails();
	}
}