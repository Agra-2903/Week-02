class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}

class Manager extends Employee{
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void display(){
        System.out.println("Employee Id: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("salary: " + getSalary());
    }
}

class EmployeeRecord{
    // main class 
    public static void main(String[] args) {
        // object creation
        Manager manager = new Manager(1, "IT", 50000);
        manager.display();
    }
}
