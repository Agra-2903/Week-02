package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

//Define subclasses Student with specific attributes grade for Student).
class Student extends Person{
    protected String grade;
    Student(String name, int age , String grade){
        super(name,age);
        this.grade= grade;
    }
    @Override
    public void displayRole(){
        super.displayRole();
        System.out.println("Grade :" + this.grade);
    }
}

