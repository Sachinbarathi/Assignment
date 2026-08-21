import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("source.txt");
             FileOutputStream output = new FileOutputStream("copy.txt")) {

            int data;
            while ((data = input.read()) != -1)
                output.write(data);

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
