class Course{
    private String courseName;
    private int fee;
    private int duration;

    private static String instituteName = "LNCT";

    public Course(String courseName, int fee, int duration){
        this.courseName = courseName;
        this.fee = fee;
        this.duration = duration;
    }

    void displayCourseDetails(){
        System.out.println("Course details");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String name){
        instituteName = name;
        System.out.println("Institute updated successfully. New Institute Name: " + name);
    }
}

class CourseManagement {
    public static void main(String[] args) {
        Course c1 = new Course("B.Tech.", 50000, 4);
        c1.displayCourseDetails();
        System.out.println();

        Course c2 = new Course("M.Tech.", 60000, 2);
        c2.displayCourseDetails();
        System.out.println();
        Course.updateInstituteName("Technocrates institute of technology");
    }
}
