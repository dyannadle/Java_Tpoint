package Q_Spider_327.Tasks;

import java.util.Scanner;

public class DivisibleBy5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by both 5 and 7");
        } else {
            System.out.println(num + " is NOT divisible by both 5 and 7");
        }

        sc.close();
    }
}