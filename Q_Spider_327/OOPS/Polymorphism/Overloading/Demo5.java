package Q_Spider_327.OOPS.Polymorphism.Overloading;

public class Demo5 {
    public static void sample() {
        System.out.println("Hi");
    }

    public static void sample(double r) {
        System.out.println("Hello");

    }

    public static void sample(char ch) {
        System.out.println("Namaste");
    }

    public static void main(String[] args) {
        sample();
        sample(78);
        sample('k');
    }

}
