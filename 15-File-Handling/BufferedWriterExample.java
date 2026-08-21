import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"))) {
            writer.write("Java BufferedWriter Example");
            writer.newLine();
            writer.write("File handling is easy.");
            System.out.println("Data written");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
