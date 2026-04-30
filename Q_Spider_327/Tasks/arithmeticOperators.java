package Q_Spider_327.Tasks;

import java.util.*;

public class arithmeticOperators {
    private int a;
    private int b;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        sc.close();
    }

    public void calculate() {

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }

    public static void main(String[] args) {
        arithmeticOperators a = new arithmeticOperators();
        a.getInput();
        a.calculate();
    }
}
