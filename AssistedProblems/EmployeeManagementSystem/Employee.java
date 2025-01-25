package AssistedProblems.EmployeeManagementSystem;

//Define a base class Employee with attributes like name, id, and salary,
// and a method displayDetails()
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.printf("%-15s%-10s%-10s%n", "Name", "ID", "Salary");
        System.out.printf("%-15s%-10d%-10.2f%n", name, id, salary);
    }
}
