package AssistedProblems.EmployeeManagementSystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Creating object of each subclasses using reference of superclass
        Employee manager = new Manager("Dev", 1542, 800000, 15);
        Employee developer = new Developer("Matty", 6431, 700000, "Java");
        Employee intern = new Intern("Sameer", 6845, 100000, 3);

        // Displaying details of every object by calling the overrided method displayDetails()
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
