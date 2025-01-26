package EmployeeManagementSystem;

class FullTimeEmployee extends Employee implements Department{
    double fixedSalary;
    private String department;

    public FullTimeEmployee(String id, String name, double salary, double fixedsal){
        super(id, name, salary);
        this.fixedSalary = fixedsal;
    }

    @Override
    double calculateSalary(){
        return getSalary() + fixedSalary;
    }

    public void assignDepartment(String departmentName){
        this.department = departmentName;
    }

    public String getDepartment(){
        return department;
    }
}
