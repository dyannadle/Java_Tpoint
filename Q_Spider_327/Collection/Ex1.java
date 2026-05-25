package Q_Spider_327.Collection;

import java.util.ArrayList;

import Q_Spider_327.OOPS.Polymorphism.Overloading.Phone;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Object> u = new ArrayList<>();
        System.out.println(u);
        u.add(90);
        u.add("Hi");
        u.add('p');
        u.add("Hi");
        u.add('p');
        u.add(new Phone());
        System.out.println(u);

    }

}
