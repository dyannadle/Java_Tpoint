package Q_Spider_327.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {

    public static void main(String[] args) {
        ArrayList m1 = new ArrayList<>();
        m1.add("Burgers");
        m1.add("Pizza");
        m1.add("Pasta");
        m1.add("French fries");
        m1.add("Wrap");
        System.out.println("Fast food items :" + m1);

        ArrayList m2 = new ArrayList<>();
        m2.add("Coffee");
        m2.add("Tea");
        m2.add("Juice");
        m2.add("Milk");
        System.out.println("Hot beverage items :" + m2);

        ArrayList m3 = new ArrayList<>();
        m3.add("roti");
        m3.add("Panner Tadka");
        m3.add("Dal");
        m3.add("Rice");
        System.out.println("Main course items :" + m3);

        ArrayList m4 = new ArrayList<>();
        m4.add("Idli");
        m4.add("Dosa");
        m4.add("Upma");
        m4.add("Vada");
        System.out.println("South Indian items :" + m4);

        m1.addAll(m2);
        m1.addAll(m3);
        m1.addAll(m4);
        System.out.println("All items:" + m1);
        Iterator i = m1.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }
    }

}
