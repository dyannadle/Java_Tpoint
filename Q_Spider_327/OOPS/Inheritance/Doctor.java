package Q_Spider_327.OOPS.Inheritance;

public class Doctor {
    // String name = "John";
    static String name = "John";
    int DLno = 123;

    // create method called Checkpulse and CheckBp
    public static void checkPulse() {
        System.out.println("Checking pulse...");
    }

    public static void checkBP() {
        System.out.println("Checking BP...");
    }

    public void treatment() {
        System.out.println("Writing prescription...");
    }
}
