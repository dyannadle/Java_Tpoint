package Q_Spider_327.OOPS.tostring;

public class StringEx4 {
    public static void main(String[] args) {
        String s = "java";
        String s1 = s + "Programmer";
        // StringBuffer sB = new StringBuffer("JAVA");
        StringBuilder sB = new StringBuilder("JAVA");
        StringBuilder sB1 = sB.append("Programmer");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(sB);
        System.out.println(sB1);
        System.out.println(s == s1);
        System.out.println(sB == sB1);
    }

}
