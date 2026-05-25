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
    u.add(new Bag(23.5));
    System.out.println(u);

    // Adding primitive datatype values
    u.add(10); // int
    u.add(25.5); // double
    u.add('A'); // char
    u.add(true); // boolean
    u.add(123456789L); // long
    u.add(12.3f); // float
    u.add((short) 5); // short
    u.add((byte) 2); // byte
    u.add("Java"); // String

    // Adding Bag object
    Bag b1 = new Bag(101, "SkyBag", 2500);
    u.add(b1);

    // Adding Phone object
    Phone p1 = new Phone(501, "Samsung", 45000);
    u.add(p1);

    // Printing ArrayList
    System.out.println(u);
  }
}
