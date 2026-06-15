import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double heightMeters = scanner.nextDouble();

        double bmi = calculateBMI(weightKg, heightMeters);
        String category = getBMICategory(bmi);

        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        scanner.close();
    }

    public static double calculateBMI(double weightKg, double heightMeters) {
        if (heightMeters <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        return weightKg / (heightMeters * heightMeters);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
