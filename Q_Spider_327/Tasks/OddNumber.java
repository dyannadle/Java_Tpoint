package Q_Spider_327.Tasks;

import java.util.Scanner;

public class OddNumber {
    // range from 50 -100 and it should be taken from user
    // prints the odd numbers
    int a;
    int b;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range from 50 -100");
        OddNumber num = new OddNumber();
        num.a = s.nextInt();
        num.b = s.nextInt();
        num.odd(num.a, num.b);
        s.close();
    }

    public void odd(int a, int b) {
        while(a <= b) {
            if(a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
