public class pyramid {
    public static void main(String[] args) {

        // Outer loop for each row
        for (int i=1;i<=5;i++) {
            // Inner loop for spaces
            for(int j=1;j<=i;j++) {
                System.out.print(" *");
         
            }
            System.out.println();
        }
    }
}   
