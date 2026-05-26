package Q_Spider_327.Collection;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
     al.add(89);
     al.add(34);
     al.add(1, 'j');
     al.add("Hi");
     System.out.println(al);
     ArrayList<Object> al2 = new ArrayList<>();
     al2.add(9);
     al2.add(4);
     al2.addAll(0,al);
     System.out.println(al2);

    }
}