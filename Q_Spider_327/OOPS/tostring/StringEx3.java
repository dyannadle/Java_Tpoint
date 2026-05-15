package Q_Spider_327.OOPS.tostring;

public class StringEx3 {
    public static void main(String[] args) {
        String s = "All is Well don't worry ";
        String[] arr = s.split("ll");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(s.substring(0));
        System.out.println(s.substring(0, 5));
        System.out.println(s.replace("ll", "mm"));

    }

}
