package Q_Spider_327.variables; // Line 1: Package declaration — places this class in the Q_Spider_327.variables package.

import java.util.Scanner; // Line 3: Imports the Scanner class from java.util — provides methods to read user input from the console (System.in).

public class Ex8 { // Line 5: Declares the public class Ex8. Demonstrates reading input from the user using Scanner.

    public static void main(String[] args) { // Line 6: Program entry point.
        Scanner s = new Scanner(System.in); // Line 7: Creates a Scanner object 's' that reads from standard input (keyboard). 'System.in' is the input stream connected to the console.
        System.out.println("Enter your Age :"); // Line 8: Prompts the user to enter their age by printing a message to the console.
        String age = s.next(); // Line 9: Reads the next token (word) the user types and stores it as a String in 'age'. (.next() reads until whitespace; use .nextLine() to read an entire line.)
        System.out.println("Your age is: " + age); // Line 10: ✅ FIX — Now actually USES the 'age' variable. Previously this was just 'System.out.println()' which printed a blank line, leaving 'age' unused and triggering the warning.
    } // Line 11: Closes the main method.

} // Line 12: Closes the Ex8 class.
