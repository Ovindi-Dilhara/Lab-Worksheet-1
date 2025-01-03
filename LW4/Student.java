package Answers;

import java.util.ArrayList;

class Student extends Person {

    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled = new ArrayList<>();

    public Student(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + degree.getName());
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled() {
        for (Course course : coursesEnrolled) {
            course.displayInfo();
        }
    }
    
}