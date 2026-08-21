import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String b = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x, y) ? "Anagram" : "Not Anagram");
        sc.close();
    }
}
