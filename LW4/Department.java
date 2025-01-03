package Answers;

import java.util.ArrayList;

public class Department {
    
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering = new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        }
    }

    public void appointDepartmentHead(Lecturer head) {
        this.departmentHead = head;
    }

    public String getName() {
        return name;
    }
    
}