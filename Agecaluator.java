import java.util.Scanner;

public class Agecaluator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the birth year : ");
        int year = in.nextInt();
        int age;
        age = 2025 - year;
        System.out.println("The Age is : " + age);
    }
}