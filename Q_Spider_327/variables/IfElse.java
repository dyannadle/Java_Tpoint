package Q_Spider_327.variables;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num = scan.nextInt();
        int num1 = scan.nextInt();

        if (num > num1) {
            System.out.println(num + " is greater than " + num1);
        } else {
            System.out.println(num + " is lesser than " + num1);
        }

        System.out.println("stop...");
        scan.close(); // Also resolving the resource leak here
    }

}
