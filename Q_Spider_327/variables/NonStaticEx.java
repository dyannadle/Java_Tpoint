package Q_Spider_327.variables; // Line 1: Declares this class belongs to the 'Q_Spider_327.variables' package — a nested package matching the directory structure (Q_Spider_327/variables/).

// Line 2: Blank line for readability — separates the package declaration from the class definition.

public class NonStaticEx { // Line 3: Declares a public class named 'NonStaticEx'. Demonstrates the difference between static and non-static (instance) methods.

    public static void main(String[] args) { // Line 4: Program entry point. JVM always starts execution here. Must be 'public static void' with 'String[] args' parameter.
        NonStaticEx t = new NonStaticEx(); // Line 5: Creates a new object (instance) of the NonStaticEx class using the 'new' keyword and the default constructor. Stored in reference variable 't'. This object is needed to call non-static methods.
        t.demo(); // Line 6: Calls the non-static method 'demo()' on object 't'. Non-static methods REQUIRE an object reference to be invoked — they belong to the instance, not the class.
        System.out.println(eligibility("Indian", 60)); // Line 7: Calls the static method 'eligibility' directly (no object needed) with "Indian" and age 60. Prints the returned String ("Eligible") to the console.
    } // Line 8: Closes the 'main' method body.

    // Line 9: Blank line for readability.

    public void demo() { // Line 10: Declares a public NON-STATIC (instance) method named 'demo'. Returns void (nothing). Because it's non-static, it can only be called on an object instance (e.g., t.demo()).
        System.out.println("Hello!.."); // Line 11: Prints the string "Hello!.." to the console.

    } // Line 13: Closes the 'demo' method body. (Line 12 is a blank line inside the method.)

    // Line 14: Blank line for readability.

    public static String eligibility(String nationality, int age) { // Line 15: Declares a public STATIC method named 'eligibility'. Returns a String. Takes a String parameter 'nationality' and an int parameter 'age'. Being static, it can be called without an object.
        return nationality == "Indian" && (age >= 18 && age <= 80) ? "Eligible" : "Not Eligible "; // Line 16: Uses the ternary operator (condition ? valueIfTrue : valueIfFalse). Checks if nationality equals "Indian" AND age is between 18-80 (inclusive). ⚠️ WARNING: Uses '==' for String comparison — this compares REFERENCES, not content. Use '.equals()' for reliable String comparison in Java.
    } // Line 17: Closes the 'eligibility' method body.

} // Line 18: Closes the 'NonStaticEx' class body.
