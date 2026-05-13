package Q_Spider_327.OOPS.tostring;

public class StringEx1 {
    public static void main(String[] args) {
        String s = "hi";
        String s1 = "hi";
        System.out.println(s == s1);
        System.out.println(s == "Hi");
        System.out.println(s1 == "hi");
        String k = new String("hi");
        String q = new String("hi");
        System.out.println(k == q);
    }

}
