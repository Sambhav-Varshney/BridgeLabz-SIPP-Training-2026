import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = calculateBonus(salary, yearsOfService);
        System.out.printf("Employee bonus: %.2f\n", bonus);

        scanner.close();
    }

    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return salary * 0.05;
        }
        return 0.0;
    }
}
