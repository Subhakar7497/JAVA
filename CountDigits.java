
// JAVA Code to count number of
// digits in an integer
import java.util.*;

class CountDigits {

    static int countDigit(int n) {
        if (n / 10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {
        int n = 589646;
        System.out.print(countDigit(n));
    }
}