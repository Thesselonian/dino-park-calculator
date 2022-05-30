import java.util.Scanner;

public class DinoParkCalculator {
    public static void main(String[] args) {
        // Create new instance of keyboard scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Create variables that will be used to calculate cost
        boolean member = false;
        int additionalAdults = 0;
        int additionalChildren = 0;
        int selectionValue = 0;

        // Display options to user
        System.out.println("Welcome to the Dinosaur Park Party Planner");
        System.out.println("Choose the type of party");
        System.out.println("1. Group Rate Admission Party");
        System.out.println("2. Bare Bones Package");
        System.out.println("3. Deluxe Party Package");
        System.out.println("4. Quit");
        System.out.println("Enter choice: ");
        keyboard.nextInt();

        keyboard.close();
    }
}

