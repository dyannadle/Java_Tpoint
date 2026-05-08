package Q_Spider_327.OOPS.Polymorphism.Overloading;

public class Cup {
    String bName;
    double price;
    String color;

    Cup(double price) {
        this("Cello ", "Purple ");
        this.price = price;

    }

    Cup() {
        this(1000);
        System.out.println("No args ....");
    }

    Cup(String bName, String color) {
        this.bName = bName;
        this.color = color;
    }

    public static void main(String[] args) {
        Cup c = new Cup();
        System.out.println(c.bName);
        System.out.println(c.price);
        System.out.println(c.color);
    }

}
