import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();
        int i = 1;
        System.out.println("Even and Odd numbers from 1 to " + n + ":");
        while (i <= n) {
            if (i % 2 == 0) 
                System.out.println(i + " is Even");
            else {
                System.out.println(i + " is Odd");
            }
            i++;
        }
    }
}
