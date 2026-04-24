package Q_Spider_327.OOPS;

public class StaticEx2 {
    static int r = 34;
    int w = 90;

    public static void main(String[] args) {
        System.out.println(r);
        System.out.println(StaticEx2.r = 45);
        new StaticEx2();
        System.out.println(StaticEx2.r);
        new StaticEx2();
        System.out.println(StaticEx2.r);

    }

}
