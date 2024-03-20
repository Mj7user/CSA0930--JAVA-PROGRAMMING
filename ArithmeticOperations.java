import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        int a, b;
        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Enter two numbers:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Enter two numbers:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                System.out.println("Enter two numbers:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                try {
                    System.out.println("Result: " + (a / b));
                } catch (ArithmeticException  e) {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}