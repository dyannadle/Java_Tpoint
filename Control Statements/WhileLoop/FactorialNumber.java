public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5; // Number to calculate factorial
        int factorial = 1;

        // Using while loop to calculate factorial
        int i = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}