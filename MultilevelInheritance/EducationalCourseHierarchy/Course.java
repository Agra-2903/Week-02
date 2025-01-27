package MultilevelInheritance.EducationalCourseHierarchy;

//Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
//Define a superclass Course with attributes like courseName and duration.
class Course{
    protected String courseName;
    protected int year;
    Course(String courseName, int year){
        this.courseName= courseName;
        this.year= year;
    }
    public void displayCourse(){
        System.out.println("CourseName :" +this.courseName);
        System.out.println("Year :" +this.year);
    }
}
