import java.util.*;

class University{
	String universityName;
	ArrayList<Faculty> faculties;
	ArrayList<Department> departments;
	
	public University(String name){
		this.universityName = name;
		this.faculties = new ArrayList<>();
		this.departments = new ArrayList<>();
	}
	
	void addDepartment(String name){
	    Department d = new Department(name);
		departments.add(d);
	}
	
	void addFaculty(int id, String name){
	    Faculty f = new Faculty(id, name);
		faculties.add(f);
	}
	
	void displayDetails(){
		System.out.println("===========" + universityName + "===========");
		System.out.println("----------- Departments -----------");
		for(Department department: departments){
			System.out.println(department.departmentName);
		}
		System.out.println("----------- Faculty ------------");
		for(Faculty faculty: faculties){
			System.out.printf("%-10d%-15s%n", faculty.getFacultyId(), faculty.facultyName);
		}
	}
	
	void deleteUniversity(){
		this.universityName = null;
		this.departments.clear();
		this.faculties.clear();
		System.out.println("University data deleted");
	}
}

class Faculty{
	private int facultyId;
	String facultyName;
	
	public Faculty(int id, String name){
		this.facultyId = id;
		this.facultyName = name;
	}
	
	int getFacultyId(){
		return this.facultyId;
	}
}

class Department{
	String departmentName;
	
	public Department(String name){
		this.departmentName = name;
	}
}

class FacultiesAndDepartments{
	public static void main(String[]args){
		University uni1 = new University("TIT college");
		
		uni1.addDepartment("Eng");
		uni1.addDepartment("Doc");
		
		uni1.addFaculty(151621, "Shaun");
		uni1.addFaculty(111684, "Alex");
		uni1.addFaculty(564145, "Matty");
		
		uni1.displayDetails();
		uni1.deleteUniversity();
		uni1.displayDetails();
	}
}