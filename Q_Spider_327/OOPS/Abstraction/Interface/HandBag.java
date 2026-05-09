package Q_Spider_327.OOPS.Abstraction.Interface;

public class HandBag implements Bag {

    public void carry() {

        System.out.println("Carrying Things ");

    }

    public static void main(String[] args) {
        Bag b = new HandBag();
        b.carry();
    }
}
