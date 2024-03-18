import java.util.Scanner;

public class salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Employee's base salary
        System.out.print("Enter base salary: ");
        double baseSalary = scanner.nextDouble();

        // Calculating 10% bonus
        double bonus = 0.1 * baseSalary;

        // Calculating gross salary (base salary + bonus)
        double grossSalary = baseSalary + bonus;

        // Output: Printing base salary and gross salary
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus (10%): $" + bonus);
        System.out.println("Gross Salary: $" + grossSalary);

        scanner.close();
    }
}