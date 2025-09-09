package Constructor;

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
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("-----------------------------");
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); 
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("-----------------------------");
    }
}

public class acess_prob1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 8.5);
        s1.displayStudentDetails();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Riya", 9.1, "Computer Science");
        pg1.displayPGDetails();

        pg1.setCGPA(9.3);
        pg1.displayPGDetails();
    }
}
