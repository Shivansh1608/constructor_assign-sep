package assignment_2;

import java.util.ArrayList;

class Course {
    String courseName;
    Professor professor;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.professorName + " assigned to teach " + courseName);
    }

    void showCourse() {
        System.out.println("Course: " + courseName + 
                           (professor != null ? ", Professor: " + professor.professorName : ""));
    }
}

class Professor {
    String professorName;
    ArrayList<Course> courses;

    Professor(String professorName) {
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    void addCourse(Course c) {
        courses.add(c);
        c.assignProfessor(this);
    }

    void showProfessorCourses() {
        System.out.println("\nProfessor: " + professorName);
        for (Course c : courses) {
            c.showCourse();
        }
    }
}

class Student {
    String studentName;
    ArrayList<Course> enrolledCourses;

    Student(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        enrolledCourses.add(c);
        System.out.println(studentName + " enrolled in " + c.courseName);
    }

    void showEnrolledCourses() {
        System.out.println("\nStudent: " + studentName);
        for (Course c : enrolledCourses) {
            c.showCourse();
        }
    }
}

public class prob_5 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Verma");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");
        Course c3 = new Course("Database Systems");

        p1.addCourse(c1);
        p1.addCourse(c2);
        p2.addCourse(c3);

        Student s1 = new Student("Shivansh");
        Student s2 = new Student("Ananya");

        s1.enrollCourse(c1);
        s1.enrollCourse(c3);
        s2.enrollCourse(c2);

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        p1.showProfessorCourses();
        p2.showProfessorCourses();
    }
}
