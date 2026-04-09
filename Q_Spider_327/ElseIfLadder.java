package Q_Spider_327;

import java.util.Scanner; // Fixes the 'Scanner cannot be resolved' error

public class ElseIfLadder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int a = s.nextInt();
        
        if (a > 0) {
            System.out.println(a + " is a Positive Number");
        } else if (a < 0) {
            System.out.println(a + " is a Negative Number");
        } else {
            System.out.println("The number is Zero");
        }
        
        s.close(); // Remember to close the scanner to prevent resource leaks
    }
}
