public class PreventingInfiniteLoop {
    public static void main(String[] args) {
        int count =0;

        // Using while loop with a proper termination condition
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Incrementing Count to prevent infinite loop
        }
    }
}