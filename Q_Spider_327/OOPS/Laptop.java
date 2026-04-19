
package Q_Spider_327.OOPS;

public class Laptop {
    String bName;
    int ram;
    boolean graphic;

    public Laptop(String bName) {
        this.bName = bName;
    }

    public Laptop(int ram) {
        this.ram = ram;
    }

    public Laptop(boolean graphic) {
        this.graphic = graphic;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("ASUS");
        Laptop l2 = new Laptop(4 + "GB");
        Laptop l3 = new Laptop(false);
        System.out.println(l1.bName);
        System.out.println(l2.ram);
        System.out.println(l3.graphic);
    }
}