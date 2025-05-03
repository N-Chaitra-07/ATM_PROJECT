import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Input for logical operations
        System.out.print("Enter first boolean value (true/false): ");
        boolean x = scanner.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean y = scanner.nextBoolean();
  // Logical operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("x && y (AND): " + (x && y));
        System.out.println("x || y (OR): " + (x || y));
        System.out.println("!x (NOT): " + (!x));
        // Input for bitwise operations
        System.out.print("\nEnter first integer: ");
        int a = scanner.nextInt();
System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
// Bitwise operators
        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("x & y (AND): " + (a & b));
        System.out.println("x | y (OR): " + (a | b));
        System.out.println("x ^ y (XOR): " + (a ^ b));
        System.out.println("~x (NOT): " + (~a));
        System.out.println("x << 1 (Left shift): " + (a<< 1));
        System.out.println("x >> 1 (Right shift): " + (a >> 1));

       
    }
}

