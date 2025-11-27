// while (condition){      
//  //code to be executed     
//  while (condition){      
//   //code to be executed     
//   Increment / decrement statement    
//  }  
//  Increment / decrement statement    
// }      



public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println("Outer Loop Iteration: " + i);
            int j = 1;
            while (j <= 2) {
                System.out.println("  Inner Loop Iteration: " + j);
                j++;
            }
            i++;
        }
    }
}
