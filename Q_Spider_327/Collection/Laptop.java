package Q_Spider_327.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Laptop {
    String name;

    public Laptop(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<Laptop> l1 = new ArrayList<>();
        l1.add(new Laptop("Dell"));
        l1.add(new Laptop("HP"));
        l1.add(new Laptop("Lenovo"));
        l1.add(new Laptop("Acer"));
        System.out.println(l1);
        Iterator<Laptop> i = l1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
