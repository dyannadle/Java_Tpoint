package Q_Spider_327.variables;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Age :");
        String age = s.next();
        System.out.println("Your age is: " + age);
        s.close(); // Closed scanner to fix resource leak
    }

}
