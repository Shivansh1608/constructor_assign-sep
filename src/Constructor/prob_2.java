package Constructor;

public class prob_2 {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public prob_2(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("--------------------------------");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        prob_2 c1 = new prob_2("Java Programming", 6, 15000);
        prob_2 c2 = new prob_2("Web Development", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        prob_2.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
