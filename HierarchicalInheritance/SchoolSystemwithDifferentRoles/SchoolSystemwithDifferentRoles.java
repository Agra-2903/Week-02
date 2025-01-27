package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

public class SchoolSystemwithDifferentRoles {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Person person = new Person("Alex",45);
        Teacher teacher = new Teacher("Jinny", 34, "Maths");
        Student student = new Student("Rohan" , 23, "A");
        Staff staff = new Staff("Rinny", 67);
        //calling out their respective methods
        person.displayRole();
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }

}
