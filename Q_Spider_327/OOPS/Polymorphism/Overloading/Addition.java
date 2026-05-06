package Q_Spider_327.OOPS.Polymorphism.Overloading;

public class Addition {
    public static double add(double d) {
        return d + d;
    }

    public static double add(double d, double d1) {
        return d + d1;
    }

    public static double add(double d, double d1, double d2) {
        return d + d1 + d2;
    }

    public static void main(String[] args) {
        System.out.println(add(90, 'a', 8.9));
    }
}
