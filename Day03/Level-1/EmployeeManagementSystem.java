class Employee{
	private static String companyName = "PQR Ltd. Company";
	public String name;
	public final int employeeId;
	protected String designation;
	private int salary;
	static int employeeCount = 0;
	
	public Employee(String name, int id, String des, int salary){
		this.name = name;
		this.employeeId = id;
		this.designation = des;
		this.salary = salary;
		employeeCount++;
	}
	
	int getSalary(){
		return this.salary;
	}
	
	void setSalary(int salary){
		this.salary = salary;
	}
	
	static void displayTotalEmployees(){
		System.out.println("Total number of employee working: " + employeeCount);
	}
}

class Manager extends Employee{
	public Manager(String name, int id, String des, int salary){
		super(name, id, des, salary);
	}
	
	public void displayDetails(){
	    System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + getSalary());
	}
}

class EmployeeManagementSystem{
	public static void main(String[]args){
		Manager emp1 = new Manager("Naman", 65456, "Junior Analyst", 124560);
		Manager emp2 = new Manager("Vikas", 54654, "Senior Analyst", 123450);
		
		if(emp1 instanceof Employee){
			emp1.displayTotalEmployees();
		}
		emp2.displayDetails();
	}
}