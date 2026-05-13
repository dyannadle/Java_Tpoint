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
        System.out.println(k.equals(q));
        System.out.println(k.equals(s1));
        String str = "Java";
        System.out.println(str);
        System.out.println(str.concat(str));
        String str1 = str + "Programmer";
        System.out.println(str1);
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.equals("java"));
        System.out.println(str.equalsIgnoreCase("java"));
    }

}
