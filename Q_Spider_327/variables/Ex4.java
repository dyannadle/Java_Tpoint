package Q_Spider_327.variables;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(add(90, 50));
        int res = add(78, 22);
        System.out.println(res);
        
        // Testing the new double version
        System.out.println(add(90.5, 50.5));
    }

    // Original method for ints
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for doubles
    public static double add(double a, double b) {
        return a + b;
    }
}
