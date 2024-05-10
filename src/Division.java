import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int denominator = scanner.nextInt();

        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}