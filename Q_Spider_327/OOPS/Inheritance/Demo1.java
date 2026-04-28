package Q_Spider_327.OOPS.Inheritance;

public class Demo1 extends Demo {
    int i;

    Demo1() {
        this(10);
        System.out.println("Child");
    }

    Demo1(int i) {
        super(24.9);
        this.i = i;
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        System.out.println("hi");
        System.out.println(d.i);
    }

}
