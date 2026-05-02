package Q_Spider_327.Tasks;

public class Bag {
    private String bName;
    private double price;
    private String color;

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bag() {
    }

    public Bag(String bName, double price, String color) {
        this.bName = bName;
        this.price = price;
        this.color = color;
    }

}
