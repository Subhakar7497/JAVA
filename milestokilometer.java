import java.util.Scanner;

public class milestokilometer {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the miles : ");
        float miles = in.nextFloat();
        double convert;
        convert = miles * 1.609344;
        System.out.println(" The converted km is: " + convert);
    }

}
