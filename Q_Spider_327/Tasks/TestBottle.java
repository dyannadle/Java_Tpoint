package Q_Spider_327.Tasks;

public class TestBottle {
    public static void main(String[] args) {
        Bottle b = new Bottle();

        // default values
        System.out.println(b.getColor());
        System.out.println(b.getPrice());

        // update values
        b.setColor("red");
        b.setPrice(1500);

        // updated values
        System.out.println(b.getColor());
        System.out.println(b.getPrice());
    }
}