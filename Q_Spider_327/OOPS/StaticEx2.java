package Q_Spider_327.OOPS;

public class StaticEx2 {
    static int r = 34;
    int w = 90;

    public static void main(String[] args) {
        System.out.println(r);
        System.out.println(StaticEx2.r = 45);
        StaticEx2 e = new StaticEx2();
        System.out.println(e.r);
        StaticEx2 e1 = new StaticEx2();
        System.out.println(e1.r);

    }

}
