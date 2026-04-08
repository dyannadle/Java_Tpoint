package Q_Spider_327.variables;

public class Ex5 {
    public static void main(String[] args) {
        // This now works because I added an overloaded add(double, double) method in Ex4
        double result = Ex4.add(90, 50.5); 
        System.out.println("The sum is: " + result);
    }
}
