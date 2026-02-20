import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        // Ask the user to enter their birth month (1-12)
        System.out.print("Enter your birth month (1-12): ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();

            // Check if input is in range
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                // Output error message for out of range values
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}