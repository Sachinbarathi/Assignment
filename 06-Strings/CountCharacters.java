import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                count++;
        }

        System.out.println("Characters: " + count);
        sc.close();
    }
}
