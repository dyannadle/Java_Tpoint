package Q_Spider_327.OOPS.Inheritance.Hierarchical_inheritance;

public class TestBag {

    public static void main(String[] args) {
        Handbag hb = new Handbag();
        hb.setcolor("Black");
        hb.setbName("Aldo");
        System.out.println(hb.getbName());
        System.out.println(hb.getcolor());
        SchoolBag s = new SchoolBag();
        s.setBagcolor("red");
        s.setBagprice(10000);
        s.setCapacity(10);
        System.out.println(s.getBagcolor());
        System.out.println(s.getBagprice());
        System.out.println(s.getCapacity());
    }
}
