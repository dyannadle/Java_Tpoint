
package Q_Spider_327.Exception;

public class Factorial {

    public static void main(String[] args) {
        int factor = fact(5);
        System.out.println(factor);

    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;

        } else {
            return num * fact(num - 1);
        }
    }
}