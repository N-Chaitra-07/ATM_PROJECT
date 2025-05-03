import java.util.Scanner;
 public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int temp = Math.abs(number);
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        if (Math.abs(originalNumber) == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        
    }
}
