import java.util.Array

public class SearchEx1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(5);
        al.add(23);
        al.add(18);
        System.out.println(al);
        int keyElement = 50;
        System.out.println(al.contains(keyElement));
        System.out.println(al.indexOf(keyElement));
        System.out.println(al.lastIndexOf(keyElement));
    }
}