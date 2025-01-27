package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

//Create a hierarchy for a school system where Person is the superclass,
// and Teacher, Student, and Staff are subclasses.
//Define a superclass Person with common attributes like name and age.
class Person{
    protected String name;
    protected int age;
    Person(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void displayRole(){
        System.out.println("Name :" +this.name);
        System.out.println("Age :" + this.age);
    }
}

