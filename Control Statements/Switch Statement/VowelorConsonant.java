public class VowelorConsonant {
    public static void main(String[] args) {
        char ch = 'E';
        // switch statement to check if the character is a vowel or consonant
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel");
                break;
            default:
                System.out.println(ch + " is a Consonant");
        }
    }
}