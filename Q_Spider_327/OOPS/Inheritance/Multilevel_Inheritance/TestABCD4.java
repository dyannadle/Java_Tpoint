package Q_Spider_327.OOPS.Inheritance.Multilevel_Inheritance;

public class TestABCD4 {

    public static void main(String[] args) {
        A4 a = new A4();
        System.out.println(a instanceof A4);
        System.out.println(a instanceof B4);
        System.out.println(a instanceof C4);
        System.out.println(a instanceof D4);

        // B4 b = new B4();
        // System.out.println(b instanceof A4);
        // System.out.println(b instanceof B4);
        // System.out.println(b instanceof C4);
        // System.out.println(b instanceof D4);

        C4 a1 = new C4();
        System.out.println(a1 instanceof A4);
        System.out.println(a1 instanceof C4);
        System.out.println(a1 instanceof D4);

        D4 a2 = new D4();
        System.out.println(a2 instanceof A4);
        System.out.println(a2 instanceof C4);
        System.out.println(a2 instanceof D4);

    }
}
