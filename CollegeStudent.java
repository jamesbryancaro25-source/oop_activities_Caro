
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 27, 2026
 */

public class CollegeStudent extends Student {
    private String scholarshipStatus;

    public CollegeStudent(String name, String studentId, String course,
                          int yearLevel, String scholarshipStatus) {
        super(name, studentId, course, yearLevel);
        this.scholarshipStatus = scholarshipStatus;
    }

    // Getter
    public String getScholarshipStatus() {
        return scholarshipStatus;
    }

    // Setter
    public void setScholarshipStatus(String scholarshipStatus) {
        this.scholarshipStatus = scholarshipStatus;
    }

    // Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Scholarship: " + scholarshipStatus);
    }
}
