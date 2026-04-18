package Q_Spider_327.OOPS;

public class Bike {
    String bName;

    public Bike(String name) {
        this.bName = name;
    }

    public static void main(String[] args) {
        Bike b = new Bike("Splendor");
        System.out.println(b.bName);
    }
}
