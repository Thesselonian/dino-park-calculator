import java.util.Scanner;

public class DinoParkCalculator {
    public static void main(String[] args) {
        

        // Create variables that will be used to calculate cost
        // boolean member = false;
        // boolean memberContinue = false;
        // int adultsPaid = 0;
        // int childrenPaid = 0;
        // int selectionValue = 0;
        // double price = 0;

        // Display options to user
        // while (selectionValue != 4) {
            PackageDetermination();
            // System.out.println("Welcome to the Dinosaur Park Party Planner");
            // System.out.println("Choose the type of party");
            // System.out.println("1. Group Rate Admission Party");
            // System.out.println("2. Bare Bones Package");
            // System.out.println("3. Deluxe Party Package");
            // System.out.println("4. Quit");
            // System.out.println("Enter choice: ");
            // // Assign the selectionValue
            // selectionValue = keyboard.nextInt();
            // if(selectionValue > 4 || selectionValue < 0) {
            //     System.out.println("Please enter a valid selection");
            //     selectionValue = 0;
            // }
            // // Clear the buffer
            // keyboard.nextLine();
            
            
            // ;
            // // Logic for a group rate general admission party
            // if (selectionValue == 1) {
            //     // Ask how many adults
            //     System.out.println("How many adults will be attending (age 13+)?");
            //     adultsPaid = keyboard.nextInt();
            //     keyboard.nextLine();
            //     // Ask how many children
            //     System.out.println("How many children will be attending (age 2-12)?");
            //     childrenPaid = keyboard.nextInt();
            //     keyboard.nextLine();
            //     price = ((adultsPaid * 5) + (childrenPaid * 4));

            // }
        // }

        // keyboard.close();
    }   

    static void PackageDetermination() {
        // Create new instance of keyboard scanner
        Scanner keyboard = new Scanner(System.in);
        int selectionValue = 0;
        while (selectionValue == 0) {
            System.out.println("Welcome to the Dinosaur Park Party Planner");
            System.out.println("Choose the type of party");
            System.out.println("1. Group Rate Admission Party");
            System.out.println("2. Bare Bones Package");
            System.out.println("3. Deluxe Party Package");
            System.out.println("4. Quit");
            System.out.println("Enter choice: ");
            // Assign the selectionValue
            selectionValue = keyboard.nextInt();
            if(selectionValue > 4 || selectionValue < 0) {
                System.out.println("Please enter a valid selection");
                selectionValue = 0;
            }
            switch (selectionValue) {
                case (1): {
                    GroupRateGeneralAdmission();
                }
                case (2): {
                    BareBonesPackage();
                }
            }
        }
    }
    static void GroupRateGeneralAdmission() {
        Scanner keyboard = new Scanner(System.in);
        int adults = 0;
        int children = 0;
        double price = 0;
        System.out.println("How many adults will be attending (age 13+)?");
        adults = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How many Children will be attending (age 2-12)?");
        children = keyboard.nextInt();
        keyboard.nextLine();
        price = ((adults * 5) + (children * 4));
        System.out.println("Your total price will be " + price);
        CalculateAnotherGroup();
    }

    static void BareBonesPackage() {
        DetermineMembership();
    }

    static void DetermineMembership() {
        Scanner keyboard = new Scanner(System.in);
        boolean member = false;
        boolean memberContinue = false;
        // Ask if user is a member
        while (!memberContinue) {
            System.out.println("Are you a member? Press 1 for yes and 2 for no.");
            int memberInput = keyboard.nextInt();
            if (memberInput == 1) {
                member = true;
                memberContinue = true;
            } else if (memberInput == 2) {
                memberContinue = true;
            }
            // Alert the user that the input was not valid, while loop repeats.
            else {
                System.out.println("Please enter a valid selection");
            }
        }
    }
    static void CalculateAnotherGroup() {
        Scanner keyboard = new Scanner(System.in);
        boolean calculateAnotherGroup = false;
        int anotherGroupInput = 0;
        while(anotherGroupInput == 0 ) {
            System.out.println("Would you like to calculate the price for a new group? Enter 1 for yes or 2 for no.");
            
            anotherGroupInput = keyboard.nextInt();
            if(anotherGroupInput == 1) {
                calculateAnotherGroup = true;
                PackageDetermination();
            }
            else if(anotherGroupInput == 2) {
                calculateAnotherGroup = false;
            }
            else {
                System.out.println("Please enter a valid response");
                anotherGroupInput = 0;
            }
            
        }
    }
}
