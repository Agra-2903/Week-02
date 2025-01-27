import java.util.*;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: Prof. " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public void showTeachingCourses() {
        System.out.println("Professor " + name + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");
        Course course3 = new Course("Physics");

        prof1.teachCourse(course1);
        prof2.teachCourse(course2);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student2.enrollCourse(course3);

        prof1.showTeachingCourses();
        prof2.showTeachingCourses();
        student1.showEnrolledCourses();
        student2.showEnrolledCourses();
        course1.showCourseDetails();
        course2.showCourseDetails();
        course3.showCourseDetails();
    }
}
