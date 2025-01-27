import java.util.*;

class Hospital{
	String hospitalName;
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	
	public Hospital(String name){
		this.hospitalName = name;
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
	}
	
	void addPatient(Patient p){
		patients.add(p);
	}
	
	void addDoctor(Doctor d){
		doctors.add(d);
	}
	
	void displayDetails(){
		System.out.println("===========" + hospitalName + "===========");
		System.out.println("-----------Doctors-----------");
		for(Doctor doctor: doctors){
			System.out.printf("%-15s%-15s%n", doctor.doctorName, doctor.specialization);
		}
		System.out.println("-----------Patients-----------");
		for(Patient patient: patients){
			System.out.printf("%-10d%-15s%-15s%n", patient.getPatientId(), patient.patientName, patient.getAilment());
		}
	}
}

class Doctor{
	String doctorName;
	String specialization;
	private ArrayList<Patient> patients;
	
	public Doctor(String name, String spec){
		this.doctorName = name;
		this.specialization = spec;
		this.patients = new ArrayList<>();
	}
	
	void cousult(Patient p){
		patients.add(p);
		p.consultedDoctor(this);
		System.out.println("Dr. " + doctorName + " is cousulting " + p.patientName);
	}
	
	void doctorDetails(){
		System.out.println("== Dr. " + doctorName + " - " + specialization + " ==");
		System.out.println("-----------Patients-----------");
		for(Patient patient: patients){
			System.out.printf("%-10d%-15s%-15s%n", patient.getPatientId(), patient.patientName, patient.getAilment());
		}
	}
}

class Patient{
	private int patientId;
	String patientName;
	private String ailment;
	private ArrayList<Doctor> doctors;
	
	public Patient(int id, String name, String ailment){
		this.patientId = id;
		this.patientName = name;
		this.ailment = ailment;
		this.doctors = new ArrayList<>();
	}
	
	int getPatientId(){
		return this.patientId;
	}
	
	String getAilment(){
		return this.ailment;
	}
	
	void consultedDoctor(Doctor d){
		doctors.add(d);
	}
	
	void patientDetails(){
		System.out.println("== " + patientId + " - " + patientName + " ==");
		System.out.println("-----------Doctors-----------");
		for(Doctor doctor: doctors){
			System.out.printf("%-15s%-15s%n", doctor.doctorName, doctor.specialization);
		}
	}
}

class DoctorsAndPatients{
	public static void main(String[]args){
		Hospital hospital1 = new Hospital("ABC hospital");
		
		Patient p1 = new Patient(65421, "Nihal", "Brain-related");
		Patient p2 = new Patient(84537, "Harsh", "Lung-related");
		Patient p3 = new Patient(64655, "Ayush", "Cold and cough");
		
		Doctor d1 = new Doctor("Pradeep", "neurologist");
		Doctor d2 = new Doctor("Abhishek", "Pulmologist");
		
		hospital1.addPatient(p1);
		hospital1.addPatient(p2);
		hospital1.addPatient(p3);
		
		hospital1.addDoctor(d1);
		hospital1.addDoctor(d2);
		
		d1.cousult(p1);
		d1.cousult(p2);
		d2.cousult(p1);
		d2.cousult(p3);
		
		hospital1.displayDetails();
		p1.patientDetails();
		d1.doctorDetails();
	}
}