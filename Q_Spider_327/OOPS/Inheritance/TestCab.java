package Q_Spider_327.OOPS.Inheritance;

import java.util.Scanner;

public class TestCab {
public static void main(String[] args) {
    System.out.println("Welcome");
    System.out.println("Select the cab");
    System.out.println("Press 1 for the mini ");
    System.out.println("Press 2 for the Sedan ");
    System.out.println("Press 3 for the Lux ");
    System.out.println("Enter Your Choice:");
    Scanner s = new Scanner(System.in);
    int choice = s.nextInt();
    Cab c = null;
    switch  (choice){
        case 1:{
            c=new Mini();
            break ;
        }
        case 2: {
            c= new Sedan();
            break;

        }
        case 3: {
            c= new Lux();
            break;
        }
        default: {
            System.out.println("Invalid choice");
        }
        }
        
    }
}
