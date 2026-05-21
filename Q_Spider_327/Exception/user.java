package Q_Spider_327.Exception;

import java.util.Scanner;

import Q_Spider_327.OOPS.Inheritance.Single_Level_Inheritance.A;

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
        c = obj[a].i / obj[b].j;
        System.out.println(c);

    }

}
