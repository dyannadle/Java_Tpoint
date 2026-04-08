package Q_Spider_327;

import java.util.Scanner ;
public class EligibleForVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minAge = 18;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= minAge) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting. You need to be at least " + minAge + " years old.");
        }
        scanner.close();
    }
}

