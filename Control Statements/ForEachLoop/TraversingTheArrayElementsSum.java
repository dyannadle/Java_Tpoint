public class TraversingTheArrayElementsSum {
    public static void main(String[] args) {
        int arr[] = {12,13,14,44};
        int total=0;

        
        // Using for-each loop to traverse the array elements
        for (int i:arr){
            total = total +i;
        }
System.out.println("The sum of array elements is: " + total);
        }
    }
                                                