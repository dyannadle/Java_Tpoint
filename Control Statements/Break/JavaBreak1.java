import java.util.Scanner;  
public class JavaBreak1 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Choose an option:");  
        System.out.println("1. Option 1");  
        System.out.println("2. Option 2");  
        System.out.println("3. Option 3");  
        System.out.println("4. Exit");  
        while (true) {  
            System.out.print("Enter your choice: ");  
            int choice = scanner.nextInt();  
            switch (choice) {  
                case 1:  
                    System.out.println("You chose Option 1");  
                    break; // Exit the switch statement  
                case 2:  
                    System.out.println("You chose Option 2");  
                    break; // Exit the switch statement  
                case 3:  
                    System.out.println("You chose Option 3");  
                    break; // Exit the switch statement  
                case 4:  
                    System.out.println("Exiting...");  
                    scanner.close();  
                    return; // Exit the program  
                default:  
                    System.out.println("Invalid choice. Please try again.");  
                    break; // Exit the switch statement  
            }  
        }  
    }  
}  