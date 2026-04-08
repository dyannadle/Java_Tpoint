// Line 1: (No package declaration) — This class is in the DEFAULT package. Default packages are discouraged in production but common in small learning exercises.

public class Ex4 { // Line 2: Declares a public class named 'Ex4'. ⚠️ WARNING: The filename is 'x4.java' but the class is named 'Ex4' — in Java, the public class name MUST match the filename. This will cause a compilation error. Rename the file to 'Ex4.java' or rename the class to 'x4'.

    public static void main(String[] args) { // Line 3: Entry point of the program. JVM calls this method first. 'public static void main(String[] args)' is the required signature.
        System.out.println(add(90, 50)); // Line 4: Calls the static method 'add' with int arguments 90 and 50, prints the returned result (140) to the console.
        double res = add(78, 22.9); // Line 5: ⚠️ COMPILATION ERROR: Calls 'add(78, 22.9)' — but 22.9 is a 'double' literal, and the 'add' method only accepts (int, int). Java will NOT automatically narrow a double to an int. Fix: either change the method signature to accept doubles, or cast: add(78, (int) 22.9).
        System.out.println(res); // Line 6: Prints the value stored in 'res' to the console. This line won't execute due to the error on line 5.
    } // Line 7: Closes the 'main' method body.

    // Line 8: Blank line for readability.

    public static int add(int a, int b) { // Line 9: Declares a public static method 'add' that takes two 'int' parameters and returns their sum as an 'int'. This method only handles integer addition — not doubles.
        int c = a + b; // Line 10: Adds parameters 'a' and 'b', stores the result in local variable 'c'.
        return c; // Line 11: Returns the computed sum 'c' to the caller.
    } // Line 12: Closes the 'add' method body.

} // Line 13: Closes the 'Ex4' class body.
