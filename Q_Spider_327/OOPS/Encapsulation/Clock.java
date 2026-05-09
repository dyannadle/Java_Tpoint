package Q_Spider_327.OOPS.Encapsulation;

public class Clock {
    public int hr, min, sec;

    public Clock(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;

    }

    public void time() {
        System.out.println(hr + ":" + min + ":" + sec);
    }

}
