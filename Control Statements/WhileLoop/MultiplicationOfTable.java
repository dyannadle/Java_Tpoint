public class MultiplicationOfTable {
    public static void main(String[] args) {
        //int number = 7; // Number to print the multiplication table for
        int i = 1;
        while(i<=10){
            int j=1;
            while(j<=10){
                System.out.println(i*j+"");
                j++;
            }
        System.out.println();
            i++;
        }
    }
}