package Q_Spider_327.variables; // Line 1: Package declaration.

import java.util.Scanner; // Line 3: Imports Scanner to read user input from the console.

public class IfElse { // Line 5: Class declaration — demonstrates if-else conditional branching.

    public static void main(String[] args) { // Line 6: ✅ FIX — Added missing '{' to open the method body. Without it, all statements below were considered outside any method.
        Scanner scan = new Scanner(System.in); // Line 7: Creates a Scanner object to read from standard input (keyboard).
        System.out.println("Enter the numbers : "); // Line 8: Prompts the user to enter two numbers.
        int num = scan.nextInt(); // Line 9: Reads the first integer from user input and stores it in 'num'.
        int num1 = scan.nextInt(); // Line 10: Reads the second integer from user input and stores it in 'num1'.

        if (num > num1) { // Line 12: Checks if 'num' is greater than 'num1'. The '>' operator compares two values.
            System.out.println(num + " is greater than " + num1); // Line 13: ✅ FIX — Added '+' before num1 to concatenate the variable into the string. Also fixed typo: "grater" → "greater".
        } else { // Line 15: Executes this block if the condition above is false (num <= num1).
            System.out.println(num + " is lesser than " + num1); // Line 16: ✅ FIX — Added '+' before num1 for proper string concatenation.
        } // Line 17: Closes the else block.

        System.out.println("stop..."); // Line 18: Prints "stop..." after the if-else completes — runs regardless of which branch was taken.
    } // Line 19: Closes the main method.

} // Line 20: Closes the IfElse class.
