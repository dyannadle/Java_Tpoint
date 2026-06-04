package Q_Spider_327.variables;

class car {

    String bName;
    double price;

    public car(String bName, double price) {
        this.bName = bName;
        this.price = price;
    }

    public boolean equals(Object obj) {
        car c = (car) obj;
        return this.bName.equals(c.bName) && this.price == c.price;

    }

    public String toString() {
        return "car [brand= " + bName + ", price= " + price + "]";

    }
}
