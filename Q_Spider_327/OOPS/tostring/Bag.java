package Q_Spider_327.OOPS.tostring;

public class Bag {
    private String bName;
    private double price;

    public Bag(String bName, double price) {
        this.bName = bName;
        this.price = price;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Bag[bName="+bName+", price="+price+"]";
    }

    public boolean equals(Object obj) {
        Bag g = (Bag) obj;
        return g.bName.equals(this.bName) && g.price == this.price;
    }
}
