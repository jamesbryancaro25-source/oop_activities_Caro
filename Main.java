
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 28, 2026
 */

public class Main {
    public static void main(String[] args) {

        // Create Employee objects
        Employee emp1 = new Employee(
            "Juan Dela Cruz", "EMP001", "IT", 25000.0
        );

        Employee emp2 = new Employee(
            "Maria Lopez", "EMP002", "HR", 22000.0
        );

        // Create Manager object
        Manager emp3 = new Manager(
            "Carlo Mendoza", "EMP003", "IT", 45000.0, 8
        );

        // Display employee information
        System.out.println("===== EMPLOYEE INFORMATION =====");
        System.out.println();

        emp1.displayInfo();
        System.out.println();

        emp2.displayInfo();
        System.out.println();

        // Display manager information
        System.out.println("===== MANAGER =====");
        System.out.println();

        emp3.displayInfo();
        System.out.println();

        // Update Maria Lopez's salary
        emp2.setMonthlySalary(24000.0);

        // Display updated information
        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println();

        System.out.println("Name: " + emp2.getName());
        System.out.println(
            "Monthly Salary: " + emp2.getMonthlySalary()
        );

        /*
         * REFLECTION QUESTIONS
         *
         * 1. Why should monthlySalary be private, and what
         *    does the setter protect against?
         *    Answer: It protects the salary from direct access
         *    and prevents zero or negative salary values.
         *
         * 2. Is a Manager also an Employee? Explain using
         *    the word extends.
         *    Answer: Yes, because Manager extends Employee
         *    and inherits its attributes and methods.
         *
         * 3. What is the advantage of calling super.displayInfo()
         *    inside Manager's displayInfo()?
         *    Answer: It displays the employee information
         *    first, then adds the manager's team size.
         */
    }
}
