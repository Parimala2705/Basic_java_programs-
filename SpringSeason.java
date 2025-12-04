 import java.util.Scanner{
public class SpringSeason {

    // Method to check if the date falls in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for valid spring date ranges
        return (month == 3 && day >= 20 && day <= 31) ||
               (month == 4 && day >= 1 && day <= 30) ||
               (month == 5 && day >= 1 && day <= 31) ||
               (month == 6 && day >= 1 && day <= 20);
    }

    public static void main(String[] args) {
        // Parse month and day from command line arguments
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and print whether it's spring
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
