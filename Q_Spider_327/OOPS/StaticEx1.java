package Q_Spider_327.OOPS;

public class StaticEx1 {
    int k = 78;

    public static void main(String[] args) {
        StaticEx1 t = new StaticEx1();
        System.out.println(t.k);
        StaticEx1 t1 = new StaticEx1();
        System.out.println(t1.k);
        t1.k = 90;
        System.out.println(t1.k);
        System.out.println(t.k);

        StaticEx1 t2 = new StaticEx1();
        System.out.println(t2.k);

    }

}
