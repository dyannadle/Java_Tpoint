package Q_Spider_327.Collection;

public class Bag {
    int id;
    String name;
    double price;

    public Bag(double price) {
        this.price = price;
    }

    public Bag(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        if (name != null) {
            return "Bag [id=" + id + ", name=" + name + ", price=" + price + "]";
        }
        return "Bag:" + this.price;
    }

}
