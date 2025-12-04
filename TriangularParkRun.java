public class TriangularParkRun {

    // Method to calculate the number of rounds needed
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000.0; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get triangle sides as input from user
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate and display number of rounds
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete must complete %.2f rounds to complete a 5 km run.%n", rounds);

        scanner.close();
    }
}
