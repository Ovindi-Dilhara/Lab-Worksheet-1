package Answers;

import java.util.ArrayList;

public class Degree {
    
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering = new ArrayList<>();

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering() {
        for (Course course : coursesOffering) {
            course.displayInfo();
        }
    }

    public String getName() {
        return name;
    }
    
}