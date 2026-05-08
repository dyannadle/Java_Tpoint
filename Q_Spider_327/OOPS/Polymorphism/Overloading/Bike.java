package Q_Spider_327.OOPS.Polymorphism.Overloading;

public class Bike {
    String bName;
    int Avg;

    public Bike(String bName) {
        // object//
        this.bName = bName; // local
    }

    public Bike(int Avg) {
        this.Avg = Avg;
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Splendor");
        Bike b2 = new Bike(60);
        System.out.println(b1.bName);
        System.out.println(b2.Avg);
    }
}