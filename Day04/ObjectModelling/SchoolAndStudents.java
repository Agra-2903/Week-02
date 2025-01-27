import java.util.*;

class Course{
	int courseId;
	String course;
	ArrayList<Student> students;
	
	public Course(int id, String name){
		this.courseId = id;
		this.course = name;
		this.students = new ArrayList<>();
	}
	
	void addStudent(Student s){
		students.add(s);
	}
}

class Student{
	private int studentId;
	String studentName;
	ArrayList<Course> courses;
	
	public Student(int id, String name){
		this.studentId = id;
		this.studentName = name;
		this.courses = new ArrayList<>();
	}
	
	int getStudentId(){
		return this.studentId;
	}
	
	void addCourse(Course c){
		courses.add(c);
	}
	
	void displayCourse(){
		for(Course course: courses){
			System.out.printf("%-10s", course.course);
		}
	}
}

class School{
	String schoolName;
	ArrayList<Student> students;
	
	public School(String name){
		this.schoolName = name;
		this.students = new ArrayList<>();
	}
	
	void addStudent(Student s){
		students.add(s);
	}
	
	void displayDetails(){
		System.out.println("=========" + schoolName + "=========");
		for(Student student: students){
			System.out.printf("%-10d%-15s", student.getStudentId(), student.studentName);
			student.displayCourse();
			System.out.println();
		}
	}
}

class SchoolAndStudents{
	public static void main(String[]args){
		School school = new School("ABC School");
		
		Course course1 = new Course(101, "Maths");
		Course course2 = new Course(102, "Physics");
		
		Student student1 = new Student(1235, "Akash");
		Student student2 = new Student(6514, "Aryan");
		Student student3 = new Student(6545, "Bhuvan");
		
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		
		course1.addStudent(student1);
		course1.addStudent(student2);
		course2.addStudent(student1);
		course2.addStudent(student3);
		
		student1.addCourse(course1);
		student1.addCourse(course2);
		student2.addCourse(course1);
		student3.addCourse(course2);
		
		school.displayDetails();
	}
}