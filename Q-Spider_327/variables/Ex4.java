package variables; // Line 1: Declares this class belongs to the 'variables' package — groups related classes and avoids naming conflicts

public class Ex4 { // Line 2: Declares a public class named 'Ex4'. The class name must match the filename (Ex4.java). 'public' makes it accessible from any other package.

    public static void main(String[] args) { // Line 3: Entry point of the program. JVM calls this method first. 'public' = accessible everywhere, 'static' = no object needed, 'void' = returns nothing, 'String[] args' = accepts command-line arguments.
        System.out.println(add(90, 50)); // Line 4: Calls the static method 'add' with arguments 90 and 50, prints the returned result (140) to the console. 'System.out.println' outputs text followed by a newline.
        int res = add(78, 22); // Line 5: Calls 'add' with 78 and 22, stores the returned result (100) in a local integer variable 'res'. 'int' is a 32-bit signed primitive data type.
        System.out.println(res); // Line 6: Prints the value stored in 'res' (100) to the console.
    } // Line 7: Closes the 'main' method body.

    // Line 8: Blank line for readability — separates the main method from helper methods.

    public static int add(int a, int b) { // Line 9: Declares a public static method named 'add'. Returns an 'int'. Takes two int parameters 'a' and 'b'. 'static' means it can be called without creating an object of Ex4.
        int c = a + b; // Line 10: Adds parameters 'a' and 'b', stores the sum in local variable 'c'. The '+' operator performs arithmetic addition on integers.
        return c; // Line 11: Returns the value of 'c' to the caller. This is how the method sends its computed result back.
    } // Line 12: Closes the 'add' method body.

} // Line 13: Closes the 'Ex4' class body. Every opening brace '{' must have a matching closing brace '}'.
