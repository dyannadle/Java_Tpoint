import java.util.Scanner;  
public class DoWhileLoop {  
    public static void main(String[] args) {  
        // Creating a Scanner object for reading input from the user  
        Scanner sc = new Scanner(System.in);  
        // Declare variables to store user input and the s of numbers  
        int n;  
        int s = 0;  
        int c = 0; // Variable to c the n of iterations  
        // Display a welcome message  
        System.out.println("Welcome to the Do-While Loop Program!");  
        // Start a do-while loop  
        do {  
            // Prompt the user to enter a n  
            System.out.print("Please enter the value of a and n (or -1 to exit): ");  
            // Read the n entered by the user  
            n = sc.nextInt();  
            // Check if the n is not equal to -1 (exit condition)  
            if (n != -1) {  
                // Add the n to the s  
                s += n;  
                // Increment the c of iterations  
                c++;  
            }  
            // Continue looping until the user enters -1  
        } while (n != -1);  
        // Display the s of the numbers entered  
        System.out.println("Sum of the numbers entered: " + s);  
        // Display the n of iterations (excluding the exit condition)  
        System.out.println("Number of iterations: " + c);  
        // Calculate and display the average of the numbers entered  
        double average = (double) s / c;  
        System.out.println("Average of the numbers entered: " + average);  
        // Close the Scanner object to release system resources  
        sc.close();  
    }  
}  