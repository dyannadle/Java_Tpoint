package Q_Spider_327.OOPS.Overriding;

public class Phone {
    public static void unlock(String mailid, String pwd) {
        System.out.println("Sucessfuly unlocked");

    }

    public static void unlock(long number, String pwd) {
        System.out.println("Sucessfuly unlocked");

    }

    public static void main(String[] args) {
        unlock("yd@123", "123456");
    }
}
