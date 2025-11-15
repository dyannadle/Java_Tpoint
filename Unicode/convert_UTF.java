public class convert_UTF-_8_to_Unicode {
public static void main(String[] args) {
        String utf8String = "Hello, 世界"; // UTF-8 encoded string
        byte[] utf8Bytes = utf8String.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        String unicodeString = new String(utf8Bytes, java.nio.charset.StandardCharsets.UTF_8);
        System.out.println("Original UTF-8 String: " + utf8String);
        System.out.println("Converted Unicode String: " + unicodeString);
    }    



