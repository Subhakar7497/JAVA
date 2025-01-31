public class palindrome {
    public static void main(String[] args) {

        boolean palindrome = recursion(0, 4, "madam");
        System.out.println(palindrome);
    }

    static boolean recursion(int i, int j, String str) {
        if (i >= j) {
            return true;
        }

        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return recursion(i + 1, j - 1, str);
    }
}