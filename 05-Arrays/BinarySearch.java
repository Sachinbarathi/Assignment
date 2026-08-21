import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {40, 10, 50, 20, 30};
        Arrays.sort(arr);

        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr, key);

        System.out.println(index >= 0 ? "Found at index " + index : "Not Found");
        sc.close();
    }
}
