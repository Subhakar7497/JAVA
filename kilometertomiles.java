import java.util.Scanner;

public class kilometertomiles {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the km : ");
        float km = in.nextFloat();
        double convert;
        convert = km * 0.621371;
        System.out.println(" The converted miles is: " + convert);
    }

}
