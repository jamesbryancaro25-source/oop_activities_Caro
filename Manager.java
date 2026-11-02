
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 28, 2026
 */

public class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, String employeeId,
                   String department, double monthlySalary,
                   int teamSize) {
        super(name, employeeId, department, monthlySalary);
        setTeamSize(teamSize);
    }

    // Getter
    public int getTeamSize() {
        return teamSize;
    }

    // Setter
    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            System.out.println(
                "Invalid team size! It cannot be negative."
            );
        }
    }

    // Override displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
