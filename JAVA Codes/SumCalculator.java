import java.util.Scanner;

public class SumCalculator {
    
    // Function to calculate the sum of two numbers
    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from the user
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from the user
        double num2 = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the function to calculate the sum
        double sum = calculateSum(num1, num2);

        // Print the result
        System.out.println("The sum is: " + sum);
    }
}
