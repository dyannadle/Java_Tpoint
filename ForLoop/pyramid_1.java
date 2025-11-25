public class pyramid_1 {
    public static void main(String[] args) {
        int n=6;
        // Outer loop for each row
        for (int i=1;i<=n;i++) {
            // Inner loop for spaces
            for(int j=n;j>=i;j--) {
                System.out.print(" *");
         
            }
            System.out.println();
        }
    }
}