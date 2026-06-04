package Q_Spider_327.Collection;

import java.util.ArrayList;
import java.util.Iterator;

import Control_Statements.Continue.WhileLoop;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        System.out.println(a1);
        int sum = 0;
        Iterator i = a1.iterator();
        while (i.hasNext()) {
            sum = sum + (Integer) i.next();
            System.out.println(i.next());
        }
    }

}
