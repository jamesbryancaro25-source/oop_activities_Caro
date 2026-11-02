
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 28, 2026
 */

public class Employee {
    private String name;
    private String employeeId;
    private String department;
    private double monthlySalary;

    // Constructor
    public Employee(String name, String employeeId,
                    String department, double monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        setMonthlySalary(monthlySalary);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println(
                "Invalid salary! Salary must be greater than 0."
            );
        }
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
