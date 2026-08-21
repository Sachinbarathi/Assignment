import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        int count = 0;

        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0)
                count++;
        }

        System.out.println("Vowels: " + count);
        sc.close();
    }
}
