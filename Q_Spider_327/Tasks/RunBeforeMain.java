package Q_Spider_327.Tasks;

class RunBeforeMain {

    static {
        System.out.println("Static block executed before main()");

    }

    static void m1() {
        System.out.println("static method");
    }

    static {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        m1();
    }
}