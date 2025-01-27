package MultilevelInheritance.EducationalCourseHierarchy;

//Define OnlineCourse to add attributes such as platform and isRecorded.
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    OnlineCourse(String courseName, int year, String platform, boolean isRecorded){
        super(courseName,year);
        this.platform= platform;
        this.isRecorded= isRecorded;
    }
    @Override
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Platform :" +this.platform);
        System.out.println("Recorded :" +this.isRecorded);
    }
}

