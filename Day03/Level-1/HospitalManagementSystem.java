class Patient{
	private static String hospitalName = "Sawasth Hospital";
	String name;
	final int patientID;
	private int age;
	private String ailment;
	private static int patientCount = 0;
	
	public Patient(int id, String name, int age, String ail){
	    this.patientID = id;
		this.name = name;
		this.age = age;
		this.ailment = ail;
		patientCount++;
	}
	
	static void getTotalPatients(){
		System.out.println("Total number of patients admitted: " + patientCount);
	}
	
	public void displayDetails(){
		System.out.println("Patient ID: " + patientID);
		System.out.println("Patient Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ailment: " + ailment);
	}
}

class HospitalManagementSystem{
	public static void main(String[]args){
		Patient p1 = new Patient(6551, "Sameer", 26, "Fracture");
		
		if(p1 instanceof Patient){
			p1.displayDetails();
			Patient.getTotalPatients();
		}
	}
}