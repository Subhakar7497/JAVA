import java.io.File;
import java.io.IOException;

public class createfile {
    // create a file in java
    public static void main(String[] args) {
        try {
            File answer = new File("Subhakar.txt");
            if (answer.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Error Occurred");
        }
    }
}
