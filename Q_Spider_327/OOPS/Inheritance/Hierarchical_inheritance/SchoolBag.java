package Q_Spider_327.OOPS.Inheritance.Hierarchical_inheritance;

public class SchoolBag extends Bag {
    private String bagcolor;
    private int bagprice;
    private int capacity;

    public String getBagcolor() {
        return bagcolor;
    }

    public void setBagcolor(String bagcolor) {
        this.bagcolor = bagcolor;
    }

    public int getBagprice() {
        return bagprice;
    }

    public void setBagprice(int bagprice) {
        this.bagprice = bagprice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void Carry() {
        System.out.println("Carrying Books");
    }

}
