package Q_Spider_327.OOPS.Abstraction;

public class Ex2 extends AbstractEx1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        AbstractEx1 n = new Ex2();
        System.out.println(n.a);
        n.demo();
    }

    public void demo() {
        System.out.println("Demo");
    }
}
