package Q_Spider_327.OOPS.Abstraction.Interface;

public class Calci
Extends AbstractCalci2
implemnets AbstarctCalci1
{

    public void mul(Int a, int b) {
        System.out.println(a * b);
    }

    public int add(int a, int b) {
        return a + b;

    }

    public double square(double r) {
        return r * r;

    }

    public static void main(String[] args) {
        Calci c = new Calci();
        c.mul(7, 9);
        System.out.println(c.add(0, 0));
        System.out.println(c.square(6));

    }
}
