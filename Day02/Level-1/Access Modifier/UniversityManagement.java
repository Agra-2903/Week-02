class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return this.CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    void displayResult() {
        System.out.println("Under graduate student detail");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // for taking the values from the base class
    }


    void displayPostgraduateResult() {
        System.out.println("Post graduate student detail");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());

    }
}

class UniversityManagement{
    public static void main(String[] args) {
        Student st1 = new Student(123, "Ram", 8.75);
        st1.displayResult(); 
        st1.setCGPA(9.0);
        System.out.println();

        // 
        PostgraduateStudent pg1 = new PostgraduateStudent(125, "Shyam", 8.9);
        pg1.displayPostgraduateResult();
    }
}