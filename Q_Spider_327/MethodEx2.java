package Q_Spider_327;


public class MethodEx2 {
    public static void main(String[] args) {
        add(9, 'a');
        sub(6, 'b');
        mul(5, 'c');
        div(20, 'd');
        mod(50, 10);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);

    }

    public static void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);
    }

    public static void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void mod(int a, int b) {
        System.out.println(a % b);
    }
}