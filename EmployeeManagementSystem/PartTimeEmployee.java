package EmployeeManagementSystem;

class PartTimeEmployee extends Employee implements Department{
    int workHours;
    private String department;

    public PartTimeEmployee(String id, String name, double salary, int hours){
        super(id, name, salary);
        this.workHours = hours;
    }

    public void assignDepartment(String departmentName){
        this.department = departmentName;
    }

    public String getDepartment(){
        return department;
    }

    double calculateSalary(){
        return getSalary() + (workHours * 100);
    }
}
