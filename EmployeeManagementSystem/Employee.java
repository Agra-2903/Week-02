package EmployeeManagementSystem;

abstract class Employee {
    private String employeeId;
    String name;
    private double baseSalary;

    public Employee(String id, String name, double salary){
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
    }

    String getEmployeeId(){
        return this.employeeId;
    }

    void setEmployeeId(String id){
        this.employeeId = id;
    }

    double getSalary(){
        return this.baseSalary;
    }

    void setSalary(double s){
        this.baseSalary = s;
    }

    abstract double calculateSalary();

    void displayDetails(){
        System.out.printf("%-10s%-15s%-10.2f%-10.2f%n", employeeId, name, baseSalary, calculateSalary());
    }
}
