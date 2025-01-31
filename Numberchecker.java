
// Java Program to Check the Indian Mobile Numbers
import java.util.regex.*;

public class Numberchecker {

    public static void main(String[] args) {

        // Example mobile numbers
        String[] n = { "8610902585", "7339225628" };

        // Regular expression to check if the number starts with
        // 7, 8, or 9, followed by 9 digits
        String r = "^[7-9][0-9]{9}$";

        // Iterate through the numbers and check
        // if they are valid or invalid
        for (String number : n) {
            if (number.matches(r)) {
                System.out.println(number + ": Valid Mobile Number");
            } else {
                System.out.println(number + ": Invalid Mobile Number");
            }
        }
    }
}