package Q_Spider_327.OOPS;

public class MethodEx4 {
    int a = 90;

    public static void main(String[] args) {
        MethodEx4 t1 = new MethodEx4();
        t1.demo();
        System.out.println(t1.a);
        MethodEx4 t2 = new MethodEx4();
        t2.demo();
    }

    public void demo() {

        System.out.println("hi");
        System.out.println(this.a);
        System.out.println(this.add(10, 20));
    }

    public double add(double a, double b) {
        return a + b;

    }
}
