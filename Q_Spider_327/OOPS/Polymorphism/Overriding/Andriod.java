package Q_Spider_327.OOPS.Polymorphism.Overriding;

class Andriod extends Phone {
    @Override
    void display() {
        System.out.println("This is andriod phone .");

    }

    void call() {
        System.out.println("Network issue for phone call ");
    }

}

class Main {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.display();

        Andriod a = new Andriod();
        a.display();

        Phone p2 = new Andriod();
        p2.display();

        a.call();
    }

}
