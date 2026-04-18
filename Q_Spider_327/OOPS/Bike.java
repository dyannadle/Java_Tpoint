package Q_Spider_327.OOPS;

public class Bike {
    String bName;
    int Avg; // Changed to int to allow Constructor Overloading

    // First constructor handles the Bike's name
    public Bike(String bName) {
        this.bName = bName; 
    }

    // Second constructor handles the Bike's average
    public Bike(int Avg) {
        this.Avg = Avg;
    }

    public static void main(String[] args) {
        // You cannot name two variables 'b'. Give the second one a unique name like 'b2'
        Bike b1 = new Bike("Splendor"); 
        Bike b2 = new Bike(60); 

        System.out.println(b1.bName);
        System.out.println(b2.Avg); // Must access it using the object (b2)
    }
}
