package Q_Spider_327.OOPS.tostring;

public class Phone {
    double price;
    String bName;
    String color;

    public Phone(double price, String bName, String color) {
        this.price = price;
        this.bName = bName;
        this.color = color;
    }

    public boolean equals(Object obj) {
        Phone p = (Phone) obj;
        return this.price == p.price && this.bName.equals(p.bName) && this.color.equals(p.color);
    }

}
