
import java.util.List;
import java.util.ArrayList;
public class CollectionElements {
    public static void main(String[] args) {
    ArrayList<String>list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana"); 
        list.add("Mango");
        list.add("Orange");
        List<String> fruits = list;
        
        // Using for-each loop to traverse the collection elements
        for (String s:list) {
            System.out.println(s);
        }
    }
}   
