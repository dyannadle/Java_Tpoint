package Q_Spider_327.OOPS.Polymorphism.Overloading;

public class Phone {
    int id;
    String brand;
    double price;

    public Phone() {
    }

    public Phone(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        if (brand != null) {
            return "Phone [id=" + id + ", brand=" + brand + ", price=" + price + "]";
        }
        return super.toString();
    }

    public static void unlock(String mailid, String pwd) {
        System.out.println("Sucessfuly unlocked");

    }

    public static void unlock(long number, String pwd) {
        System.out.println("Sucessfuly unlocked");

    }

    public static void main(String[] args) {
        unlock("yd@123", "123456");
    }
}
