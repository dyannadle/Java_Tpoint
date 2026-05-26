package Q_Spider_327.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Laptop {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Dell");
        l1.add("HP");
        l1.add("Lenovo");
        l1.add("Acer");
        System.out.println(l1);
        Iterator i = l1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
