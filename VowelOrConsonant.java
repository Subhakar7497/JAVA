import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String args[]) {
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
            System.out.println("The entered character is a vowel");
        } else {
            System.out.println("The entered character is not a vowel");
        }
    }
}