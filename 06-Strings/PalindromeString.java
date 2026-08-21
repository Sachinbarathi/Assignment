import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(text.equals(reversed) ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}
