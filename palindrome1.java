public class palindrome1 {

    public static void main(String[] args) {
        // variables initialization
        int num = 9876, reverse = 0, rem, temp;

        temp = num;
        // loop to find reverse number
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        ;

        // palindrome if num and reverse are equal
        if (num == reverse)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }
}