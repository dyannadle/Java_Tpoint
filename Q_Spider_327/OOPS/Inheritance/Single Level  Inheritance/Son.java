package Q_Spider_327.OOPS.Inheritance;

public class Son extends Father {
    String name = "Venu";

    public void sonDetils() {
        System.out.println("Fathers name :" + super.name);
        System.out.println("Sons name :" + name);
    }

}
