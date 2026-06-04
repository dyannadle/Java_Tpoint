package Q_Spider_327.variables;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<car> al = new ArrayList<>();
        al.add(new car("BMW", 1000000));
        al.add(new car("Audi", 1000000));
        al.add(new car("Toyota", 50000000));
        al.add(new car("Honda", 100000000));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand name of the car : ");
        String bName = sc.nextLine();
        System.out.println("Enter the price of the car : ");
        double price = sc.nextDouble();

        car c = new car(bName, price);
        if (al.contains(c)) {
            System.out.println("Car Found");
            System.out.println("Index Position : " + al.indexOf(c));
        } else {
            System.out.println("Car Not Found");
        }
        sc.close();
    }

}
