import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("sample.txt"))) {
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
