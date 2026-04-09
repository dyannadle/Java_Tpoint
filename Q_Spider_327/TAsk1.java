package Q_Spider_327;

import java.util.Scanner; // Added missing import for Scanner

public class TAsk1 {
    public static void evenOrodd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number"); // Added space for readability
        } else {
            System.out.println(num + " is an odd number"); // Added space for readability
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        // FIX: Changed 's' to 'sc' to match the variable name on line 14.
        // FIX: Changed 'next()' to 'nextInt()' to correctly read an integer.
        int n = sc.nextInt(); 
        
        evenOrodd(n);
        sc.close(); // Added close() to prevent resource leak
    }

}
