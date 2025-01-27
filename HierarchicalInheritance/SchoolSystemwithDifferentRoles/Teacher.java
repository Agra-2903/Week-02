package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

//Define subclasses Teacher with specific attributes subject
class Teacher extends Person{
    protected String subject;
    Teacher(String name, int age , String subject){
        super(name,age);
        this.subject= subject;
    }
    @Override
    public void displayRole(){
        super.displayRole();
        System.out.println("Subject :" + this.subject);
    }
}

