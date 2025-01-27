package MultilevelInheritance.EducationalCourseHierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        //creating objects of superclass and subclass
        Course course= new Course("BTech",4);
        OnlineCourse onlineCourse = new OnlineCourse("MTech",2,"Online", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("MBA",2,"Offline", false, 80000, 0.05);
        //calling their respective methods
        course.displayCourse();
        onlineCourse.displayCourse();
        paidOnlineCourse.displayCourse();

    }
}

