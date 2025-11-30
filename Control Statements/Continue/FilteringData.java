import java.util.Arrays;  
import java.util.List;  
public class FilteringData {  
    public static void main(String[] args) {  
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);  
        for (int number : numbers) {  
            if (number % 2 == 0) {  
                continue; // Skip even numbers  
            }  
            System.out.println(number);  
        }  
    }  
}