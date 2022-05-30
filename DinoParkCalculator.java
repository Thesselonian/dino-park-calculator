import java.util.Scanner;

public class DinoParkCalculator {
    //Declare global variables
    public static Scanner keyboard = new Scanner(System.in);
    public static int packageSelector = 0;
    public static int numberAdults = 0;
    public static int numberChildren = 0;
    public static boolean member = false;
    public static void main(String[] args) {
        //while loop that will loop through logic for type of party and variables for calculating cost. Breaks out of while loop when option 4 is selected
        while(packageSelector != 4) {
            PackageDetermination();
            if(packageSelector == 4) {
                break;
            }
            DetermineMembership();
            NumberOfParticipants();
            CalculateCost(numberAdults, numberChildren);
            CalculateAnotherGroup();
        }
        System.out.println("Goodbye");
    }   

    public static void PackageDetermination() {
        // Method for selecting which package
        while (packageSelector == 0) {
            System.out.println("Welcome to the Dinosaur Park Party Planner");
            System.out.println("Choose the type of party");
            System.out.println("1. Group Rate Admission Party");
            System.out.println("2. Bare Bones Package");
            System.out.println("3. Deluxe Party Package");
            System.out.println("4. Quit");
            System.out.println("Enter choice: ");
            // Assign the packageSelector
            packageSelector = keyboard.nextInt();
            // Catch if an invalid response is entered. 
            if(packageSelector > 4 || packageSelector < 1) {
                System.out.println("Please enter a valid selection");
                packageSelector = 0;
            }
        }
    }

    public static void DetermineMembership() {
        // Method for determining if user is a member
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

    public static void NumberOfParticipants() {
        // Ask user to input number of adults and children.
        System.out.println("How many adults will be attending (age 13+)?");
        numberAdults = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How many Children will be attending (age 2-12)?");
        numberChildren = keyboard.nextInt();
        // keyboard.close();
    }

    public static void CalculateCost(int numberAdults, int numberChildren) {
        // Method for calculating cost
        int price = 0;
        // Switch for which package is selected. 
        switch (packageSelector) {
            case (1): {
                price = ((numberAdults * 5) + (numberChildren * 4));
                System.out.println("Your total price will be " + price);
            }
            case (2): {
                if(member) {
                    if((numberAdults + numberChildren) <= 12) {
                        price = 99;
                    }
                    else {
                        price = (99 + ((numberAdults + numberChildren)-12)*3);
                    }
                }
                else {
                    if((numberAdults + numberChildren) <= 12) {
                        price = 119;
                    }
                    else {
                        price = (119 + ((numberAdults + numberChildren)-12)*3);
                    }
                }
            }
            case (3): {
                if(member) {
                    if((numberAdults + numberChildren) <= 12) {
                        price = 175;
                    }
                    else {
                        price = (175 + ((numberAdults + numberChildren)-12)*3);
                    }
                }
                else {
                    if((numberAdults + numberChildren) <= 12) {
                        price = 199;
                    }
                    else {
                        price = (199 + ((numberAdults + numberChildren)-12)*3);
                    }
                }
            }
        }
        System.out.println("The cost of your party is " + price + " .");
    }
    
    public static void CalculateAnotherGroup() {
        // Ask user if they would like to calculate another group
        int anotherGroupInput = 0;
        while(anotherGroupInput == 0 ) {
            System.out.println("Would you like to calculate the price for a new group? Enter 1 for yes or 2 for no.");
            anotherGroupInput = keyboard.nextInt();
            if(anotherGroupInput == 1) {
                // if the user would like to calculate another group set package selector to 0 so that PackageDetermination method will trigger in the original while loop
                packageSelector = 0;
            }
            else if(anotherGroupInput == 2) {
                // If user does not wish to calculate another group set packageSelector to 4 so that original while loop breaks and program stops.
                packageSelector = 4;
            }
            else {
                System.out.println("Please enter a valid response");
                anotherGroupInput = 0;
            }
            
        }
    }
}
