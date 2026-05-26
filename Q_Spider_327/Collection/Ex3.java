package Q_Spider_327.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        System.out.println(a1);
        Iterator i = a1.iterator();
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        // do grouping of the above

    }

}
