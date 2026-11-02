
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 27, 2026
 */

public class Main {
    public static void main(String[] args) {

        // Create Student objects
        Student student1 = new Student(
            "Ana Cruz", "STU001", "BSIT", 2
        );

        Student student2 = new Student(
            "Mark Reyes", "STU002", "BSCS", 1
        );

        // Create CollegeStudent object
        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3, "Full Scholar"
        );

        // Display student information
        System.out.println("===== STUDENT INFORMATION =====");
        System.out.println();

        student1.displayInfo();
        System.out.println();

        student2.displayInfo();
        System.out.println();

        // Display college student information
        System.out.println("===== COLLEGE STUDENT =====");
        System.out.println();

        student3.displayInfo();
        System.out.println();

        // Update Ana Cruz's year level
        student1.setYearLevel(4);

        // Display updated information
        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println();

        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());

        /*
         * REFLECTION QUESTIONS
         *
         * 1. Why should the attributes of Student be private
         *    instead of public?
         *    Answer: Private attributes protect the data and
         *    allow access through getters and setters.
         *
         * 2. What would happen if CollegeStudent did not call
         *    super(...) in its constructor?
         *    Answer: Java would try to call the parent's
         *    no-argument constructor. Since Student has no
         *    no-argument constructor, the program would
         *    produce a compilation error.
         *
         * 3. What is the benefit of overriding displayInfo()
         *    instead of writing a new method with a different name?
         *    Answer: It allows CollegeStudent to display the
         *    parent's information plus its scholarship status
         *    using the same method name.
         */
    }
}
