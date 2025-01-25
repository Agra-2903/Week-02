package AssistedProblems.EmployeeManagementSystem;

//Define a subclass Intern with its attribute duration
class Intern extends Employee{
    int duration;

    public Intern(String name, int id, double salary, int dur){
        super(name, id, salary);
        this.duration = dur;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Duration: " + duration);
    }
}
