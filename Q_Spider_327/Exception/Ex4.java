package Q_Spider_327.Exception;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("HI");
        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException u) {
            System.out.println("Handled");
        } finally {
            System.out.println("End");
        }
        System.out.println("bye");
    }
}
