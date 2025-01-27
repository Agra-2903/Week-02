package MultilevelInheritance.EducationalCourseHierarchy;

//Define PaidOnlineCourse to add fee and discount.
class PaidOnlineCourse extends OnlineCourse{
    protected int fee;
    protected double discount;
    PaidOnlineCourse(String courseName, int year, String platform, boolean isRecorded, int fee , double discount){
        super(courseName,year,platform,isRecorded);
        this.fee= fee;
        this.discount= discount;
    }
    @Override
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Fee :" +this.fee);
        System.out.println("Discount:" +this.discount);
    }
}

