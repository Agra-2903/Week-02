// Employee class created
class Employee{
	// Declare attribute
	String name;
	private int id;
	private int salary;
	
	public Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails(){
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + id);
		System.out.println("Salary: Rs. " + salary);
	}
}

class DisplayEmployeeDetails{
	public static void main(String[]args){
	    
		// Employee objects
        Employee employee1 = new Employee("Kushagra", 2021072, 60000);
		Employee employee2 = new Employee("Shreya", 2021176, 60000);
		
		System.out.println("===Employee-1 Details===");
		employee1.displayDetails();
		System.out.println("===Employee-2 Details===");
		employee2.displayDetails();
		
	}
}