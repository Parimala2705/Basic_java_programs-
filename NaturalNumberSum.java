import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Call method and display result
            int sum = findSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
