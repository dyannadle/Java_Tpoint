package Q_Spider_327.OOPS.tostring;

public class StringEx2 {
    public static void main(String[] args) {
        String s = "java devloper";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.concat("Programmer"));
        String s1 = "Java";
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.charAt(0));
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a', 2));
        System.out.println(s.indexOf("va"));
        System.out.println(s.indexOf("av", 2));
        System.out.println(s.startsWith("j"));
        System.out.println(s.endsWith("s"));
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.replace("java devloper", "junior java developer"));
    }
}
