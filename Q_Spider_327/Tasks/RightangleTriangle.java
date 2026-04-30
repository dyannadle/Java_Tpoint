package Q_Spider_327.Tasks;

public class RightangleTriangle extends Triangle {
    @Override
    public void computeArea() {
        double area = 0.5 * getBase() * getheight();
        System.out.println("Area of right angle triangle is " + area);

    }
}

class Main {
    public static void main(String[] args) {
        RightangleTriangle r = new RightangleTriangle();
        r.setBase(10);
        r.setHeight(20);
        r.computeArea();
    }

}