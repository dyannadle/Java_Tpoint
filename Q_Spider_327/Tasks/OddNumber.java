package Q_Spider_327.Tasks;

import java.util.Scanner;

public class OddNumber {
    // range from 50 -100 and it should be taken from user
    // prints the odd numbers

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range from 50 -100");
        OddNumber num = new OddNumber();
        num.a = s.nextInt();
        num.b = s.nextInt();
        num.OddNumber();

    public void odd (int a, int b){
            while(a <= b){
                if(a%2 != 0){
                    System.out.println(a);
                }
                a++;
            }   
        }

// if (num.a >= 50 && num.a <= 100) {
// for (int i = num; i <= 100; i++) {
// if (i % 2 != 0) {
// System.out.println(i);
// }
// }
// // dont give conditions

// } else {
// System.out.println("Invalid range");
// }

// }

// }
