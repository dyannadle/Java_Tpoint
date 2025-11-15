public class ConvertUTF8ToUnicode {
public static void main(String[] args) {
        String str1 = "Unicode System\u00A9";   // UTF-8 String
        byte [] charset = str1.getBytes("UTF-8");// Converting UTF-8 String to byte array
        String newstr = new String(charset, "UTF-8");// Converting byte array to Unicode String
        System.out.println("Original UTF-8 String: " + str1);
        System.out.println("Converted Unicode String: " + newstr);
} 
}



