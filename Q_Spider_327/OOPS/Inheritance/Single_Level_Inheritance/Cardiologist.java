package Q_Spider_327.OOPS.Inheritance.Single_Level_Inheritance;

public class Cardiologist extends Doctor {
    // It should contain one more property ByPassSurgery
    boolean ByPassSurgery = true;

    public Cardiologist(String name, int dlNo, boolean byPassSurgery) {
        Doctor.name = name;
        this.DLno = dlNo;
        this.ByPassSurgery = byPassSurgery;
    }

    public void ByPass() {
        System.out.println("Performing bypass surgery...");
    }

    public static void main(String[] args) {
        // 1. Create a Cardiologist object (not Doctor) so you can access ByPassSurgery
        // Instantiate Cardiologist instead of Doctor to access ByPassSurgery
        Cardiologist c = new Cardiologist("Dr. Smith", 456, true);
        
        System.out.println("Name:" + Doctor.name);
        System.out.println("DL No: " + c.DLno);
        
        Doctor.checkPulse();
        Doctor.checkBP();
        
        System.out.println("Name: " + Doctor.name);
        System.out.println("DL No: " + c.DLno);
        System.out.println("ByPass Surgery: " + c.ByPassSurgery);
    }
}
