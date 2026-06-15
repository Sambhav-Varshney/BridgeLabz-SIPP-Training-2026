import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeightsAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> heights = new ArrayList<>();
        System.out.println("Enter heights in centimeters (enter a negative value to finish):");

        while (true) {
            double height = scanner.nextDouble();
            if (height < 0) {
                break;
            }
            heights.add(height);
        }

        if (heights.isEmpty()) {
            System.out.println("No heights were entered.");
        } else {
            System.out.println("Minimum height: " + findMinHeight(heights));
            System.out.println("Maximum height: " + findMaxHeight(heights));
            System.out.println("Average height: " + calculateAverageHeight(heights));
        }

        scanner.close();
    }

    public static double findMinHeight(List<Double> heights) {
        double min = heights.get(0);
        for (double height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static double findMaxHeight(List<Double> heights) {
        double max = heights.get(0);
        for (double height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static double calculateAverageHeight(List<Double> heights) {
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        return sum / heights.size();
    }
}
