package Q_Spider_327.Collection;

import java.util.ArrayList;

import Q_Spider_327.OOPS.Polymorphism.Overloading.Phone;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Object> u = new ArrayList<>();
        System.out.println(u);
        u.add(90);// generic <integer>
        u.add(78);// gneric collection
        u.add("Hi");/// generic <string>
        u.add('p');/// generic <character>
        // u.add("Hi");//generic <string>
        // u.add('p');
        // u.add(new Phone());///generic <phone>
        System.out.println(u);

    }

}
