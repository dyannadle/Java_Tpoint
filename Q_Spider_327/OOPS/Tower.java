package Q_Spider_327.OOPS;

import Q_Spider_327.OOPS.Encapsulation.Clock;

public class Tower {
    String loc;
    double ht;
    Clock c;

    public Tower(String loc, double ht, Clock c) {
        this.loc = loc;
        this.ht = ht;
        this.c = c;
    }

    public void showTime() {
        c.time();
        System.out.println("Ready too Work!");
    }
}
