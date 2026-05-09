package Q_Spider_327.OOPS.Abstraction.Interface;

public class Sample3 implements Sample2 {
    public void demo() {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        System.out.println("Heyyy");
        Sample2 t1 = new Sample3();
        t1.demo();
        System.out.println("Byeeee");
    }

}
