class Student{
	String name;
	int rollNumber;
	int[] marks;
	
	public Student(String name, int rollNumber, int[] marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	char calculateGrade(int[] marks){
	
		double percent = (int)(marks[0] + marks[1] + marks[2]) / 3;
		
		if(percent >= 90){
			return 'A';
		}
		else if(percent >= 80){
			return 'B';
		}
		else if(percent >= 70){
			return 'C';
		}
		else if(percent >= 60){
			return 'D';
		}
		else if(percent >= 50){
			return 'E';
		}
		else{
			return 'F';
		}
	}
	
	void displayDetails(){
		System.out.printf("%-10d%-20s%-10d%-10d%-10d%-6s%n", rollNumber, name, marks[0], marks[1], marks[2], calculateGrade(marks));
	}
}

class StudentReport{
	public static void main(String[]args){
	
	    int[] marks1 = {72, 85, 80};
	    int[] marks2 = {68, 75, 66};
	    int[] marks3 = {91, 59, 73};
		
	    Student stud1 = new Student("Akash", 101, marks1);
		Student stud2 = new Student("Anurag" , 102, marks2);
		Student stud3 = new Student("Naman", 103, marks3);
		
		System.out.printf("%-10s%-20s%-10s%-10s%-10s%-6s%n", "Roll No.", "Name", "Physics", "Chemistry", "Maths", "Grade");
		stud1.displayDetails();
		stud2.displayDetails();
		stud3.displayDetails();
	}
}