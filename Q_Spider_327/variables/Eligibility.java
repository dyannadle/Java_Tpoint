package Q_Spider_327.variables;

public class Eligibility {
    public static void main(String[] args) {
        double ht = 6.0;
        double wt = 78;
        System.out.println(
                ((ht >= 5.5 && ht <= 6.1) && (wt >= 60 && wt <= 80))
                        ? "Eligible For Army"
                        : "Not Eligible for army");
    }

}
