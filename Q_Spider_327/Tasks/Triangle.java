package Q_Spider_327.Tasks;

public class Triangle extends shape {
    private double base;
    private double height;
    private double area;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public double getBase() {
        return base;

    }

    public double getheight() {
        return height;

    }

    @Override
    public void computeArea() {
        double area = (0.5) * base * height;
        System.out.println("Area of triangle is " + area);

    }
}
