package bit_manipulation;

public class ChangeCase {

    public static char to_lower(char ch) {

        return (char) (ch | ' ');
    }

    public static char to_upper(char ch) {

        return (char) (ch & '_');
    }

    public static void main(String[] args) {
        
        char ch = 'Z';
        System.out.println("Given char is: " + ch + "   after lower: " + to_lower(ch));

        ch = 'n';
        System.out.println("Given char is: " + ch + "   after UPPER: " + to_upper(ch));
    }
    
}
