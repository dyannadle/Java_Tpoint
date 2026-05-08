package Q_Spider_327.OOPS;

import Q_Spider_327.OOPS.Encapsulation.Clock;

public class TestTower {
    public static void main(String[] args) {
        Tower t = new Tower("Mumbai", 50, new Clock(7, 16, 45));
        System.out.println(t.loc);
        System.out.println(t.ht);
        System.out.println(t.c.hr);
        t.showTime();
    }
}
