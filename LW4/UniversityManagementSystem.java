package Answers;

public class UniversityManagementSystem {
    
    public static void main(String[] args) {
        
        Department softwareEngineering = new Department("Software Engineering");
        Degree computerScience = new Degree("Computer Science", 200);

        Course oop = new Course("Object-Oriented Programming", "Open", 100);

        Lecturer lecturer1 = new Lecturer("Dr. Kamal", "Professor", softwareEngineering);
        softwareEngineering.appointDepartmentHead(lecturer1);

        Student student1 = new Student("Namal Perera", "S12345", "2nd Year", computerScience);

        lecturer1.addCourse(oop);
        student1.enrollCourse(oop);

        System.out.println("Lecturer Info");
        lecturer1.displayInfo();
        lecturer1.listCoursesTeaching();

        System.out.println("\nStudent Info");
        student1.displayInfo();
        student1.listCoursesEnrolled();

        System.out.println("\nDepartment Info");
        softwareEngineering.displayInfo();
    }
}