
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 27, 2026
 */

public class Student {
    private String name;
    private String studentId;
    private String course;
    private int yearLevel;

    public Student(String name, String studentId, String course, int yearLevel) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
        setYearLevel(yearLevel);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYearLevel(int yearLevel) {
        if (yearLevel >= 1 && yearLevel <= 4) {
            this.yearLevel = yearLevel;
        } else {
            System.out.println("Invalid year level! Must be 1 to 4.");
        }
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
    }
}
