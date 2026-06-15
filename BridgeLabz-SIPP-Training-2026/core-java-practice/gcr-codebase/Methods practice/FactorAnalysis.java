import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        List<Integer> factors = getFactors(number);
        System.out.println("Factors of " + number + ": " + factors);
        System.out.println("Total number of factors: " + factors.size());
        System.out.println("Is prime: " + isPrime(number));

        scanner.close();
    }

    public static List<Integer> getFactors(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
