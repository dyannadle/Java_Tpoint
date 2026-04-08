package Q_Spider_327.variables;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println(num + " is a positive Integer .....");
        }
        System.out.println("Stop !");
        scan.close(); // Closed scanner to fix resource leak
    }
}
