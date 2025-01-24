import java.util.*;

class Employee{
	private final int employeeId;
	private String employeeName;
	static int employeeCount = 0;
	
	public Employee(int id, String name){
		this.employeeId = id;
		this.employeeName = name;
		employeeCount++;
	}
	
	int getEmployeeId(){
		return this.employeeId;
	}
	
	String getEmployeeName(){
		return this.employeeName;
	}
}

class Department{
	private int departmentId;
	private String departmentName;
	int departmentCount = 0;
	ArrayList<Employee> employees;
	
	public Department(int id, String name){
		this.departmentId = id;
		this.departmentName = name;
		this.employees = new ArrayList<>();
		departmentCount++;
	}
	
	String getDepartmentName(){
		return this.departmentName;
	}
	
	void addEmployee(int id, String name){
		Employee e = new Employee(id, name);
		employees.add(e);
	}
	
	void employeeDetails(){
		for(Employee employee: employees){
			System.out.printf("%-5d%-15s%n" , employee.getEmployeeId(), employee.getEmployeeName());
		}
	}
}

class Company{
	String companyName;
	ArrayList<Department> departments;
	
	public Company(String name){
		this.companyName = name;
		this.departments = new ArrayList<>();
	}
	
	void addDepartment(Department d){
		departments.add(d);
	}
	
	public void displayDetails(){
		System.out.println("=========" + companyName + "=========");
		for(Department department: departments){
			System.out.println("---------" + department.getDepartmentName() + "---------");
			department.employeeDetails();
		}
		System.out.println("Total Employees in the department: " + Employee.employeeCount);
	}
	
	public void deleteCompany(){
		this.companyName = null;
		this.departments.clear();
		System.out.println("Company deleted");
	}
}

class CompanyAndDepartment{
	public static void main(String[]args){
		Company company1 = new Company("ABV Bank");
		
		Department dep1 = new Department(6545, "Eng");
		Department dep2 = new Department(6782, "Doc");
		
		dep1.addEmployee(516, "Akash");
		dep1.addEmployee(517, "Aryan");
		company1.addDepartment(dep1);
		company1.addDepartment(dep2);
		
		company1.displayDetails();
		
		company1.deleteCompany();
		
		company1.displayDetails();
	}
}