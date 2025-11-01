import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scan.next().charAt(0);

        if (Character.isLetter(ch)) {
            
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }
         else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } 
        else {
            System.out.println(ch + " is a special symbol.");
        }

        scan.close();
    }
}
