public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34};
        int largest = arr[0];

        for (int value : arr) {
            if (value > largest)
                largest = value;
        }

        System.out.println("Largest: " + largest);
    }
}
