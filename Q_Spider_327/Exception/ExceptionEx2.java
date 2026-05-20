package Q_Spider_327.Exception;

public class ExceptionEx2 {
    int i = 90;

    public static void main(String[] args) {
        System.out.println("hi");
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {

            System.out.println("do not divide by a integer number");
        }
        ExceptionEx2 e = null;
        try {
            System.out.println(e.i);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        System.out.println("Bye");
        try {
            int p = Integer.parseInt("987k6543");
            System.out.println(p);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

}
