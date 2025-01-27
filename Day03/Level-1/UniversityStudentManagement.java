class Student{
	private static String universityName = "ABC Institute of Technology";
	String name;
	private final int rollNumber;
	private char grade;
	private static int studentCount = 0;
	
	public Student(String name, int rollNo, char grade){
		this.name = name;
		this.rollNumber = rollNo;
		this.grade = grade;
		studentCount++;
	}
	
	static void displayTotalStudents(){
		System.out.println("Total number of students studying: " + studentCount);
	}
}

class UniversityStudentManagement{
	public static void main(String[]args){
		Student stud1 = new Student("Rishi", 101, 'A');
		
		if(stud1 instanceof Student){
			stud1.displayTotalStudents();
		}
	}
}