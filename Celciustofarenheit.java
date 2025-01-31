import java.util.Scanner;

public class Celciustofarenheit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the celcius value : ");
        float celcius = in.nextFloat();
        float conversion;
        conversion = (celcius * 9 / 5) + 32;
        System.out.println("The farenheit is :" + conversion);

    }
}