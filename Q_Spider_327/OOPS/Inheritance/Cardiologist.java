package Q_Spider_327.OOPS.Inheritance;

public class Cardiologist extends Doctor {
    // It should contain one more property ByPassSurgery
    boolean ByPassSurgery = true;

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
