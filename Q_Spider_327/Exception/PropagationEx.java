package Q_Spider_327.Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PropagationEx {
    public static void main(String[] args) {
        try {
            demo();
        } catch (FileNotFoundException t) {
            System.out.println("Handled");
        }
        System.out.println("hi");

    }

    public static void demo() throws FileNotFoundException {
        FileNotFoundException fout = new FileNotFoundException("D://Java_Tpoint-1//Q_Spider_327//Exception//text.java");

    }
}
