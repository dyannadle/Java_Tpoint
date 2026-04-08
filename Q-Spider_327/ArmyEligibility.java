import java.util.Scanner;

public class ArmyEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minHeight = 5.5;
        double maxHeight= 6.1;
        double minWeight = 60.0 ; 
        double maxWeight = 80.0;
        
        System.out.println("--- Army Eligibility Checker ---");


        System.out.print("Enter your height (in feet): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

     
        if (height >= minHeight && height <= maxHeight) {
            if (weight >= minWeight && weight <= maxWeight) {
                System.out.println("\nCongratulations! You are eligible for the army.");
            } else {
                System.out.println("\nResult: Not Eligible.");
                System.out.println("Reason: Your weight must be between " + minWeight + "kg and " + maxWeight + "kg.");
            }
        } else {
            System.out.println("\nResult: Not Eligible.");
            System.out.println("Reason: Your height must be between " + minHeight + " and " + maxHeight + " feet.");
        }


        scanner.close();
    }
}