package Q_Spider_327.OOPS.tostring;

public class TestPhone {
    public static void main(String[] args) {
        Phone h = new Phone(10000, "Samsung", "Black");
        System.out.println(h);
        Phone h1 = new Phone(10000, "Samsung", "Black");
        System.out.println(h == h1);
        System.out.println(h.equals(h1));
    }

}
