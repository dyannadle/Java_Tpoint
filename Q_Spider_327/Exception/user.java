package Q_Spider_327.Exception;

import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        A obj[] = new A[4];
        obj[0] = new A(10, 5);
        obj[1] = new A(20, 0);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the indexes :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0;
        try{
c = obj[a].i / obj[b].j;
        }
        catch (ArithmeticException t ){
            System.out.println("Do not divide with zero");
        }
        catch (NullPointerException r){
            System.out.println("object not created ");
        }catch (Exception u ){
            System.out.println("Handled !");

        }
        System.out.println(c);

    }

}
