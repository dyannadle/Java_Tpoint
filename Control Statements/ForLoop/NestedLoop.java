public class NestedLoop{
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer Loop Iteration: " + i);
            // Inner loop
            for (int j = 1; j <= 2; j++) {
                System.out.println("  Inner Loop Iteration: " + j);
            }
        }
    }
}