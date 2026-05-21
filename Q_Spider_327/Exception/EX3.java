package Q_Spider_327.Exception;

public class EX3 {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 0, 4, 9, 3, 0, 2 };
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("enter the indexes");
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            c = arr[a] / arr[b];

        } catch (ArithmeticException r) {
            System.out.println("do not divide by zero");
        }

    }

}
