package Q_Spider_327.OOPS.tostring;

public class TestBag {
    public static void main(String[] args) {
        Bag b = new Bag("Gucci", 10000);
        System.out.println(b.getbName());
        System.out.println(b.getprice());
        System.out.println(b);
        Bag b1 = new Bag("Gucci", 10000);
        System.out.println(b.equals(b1));
    }

}
