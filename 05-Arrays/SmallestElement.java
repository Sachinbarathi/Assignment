public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34};
        int smallest = arr[0];

        for (int value : arr) {
            if (value < smallest)
                smallest = value;
        }

        System.out.println("Smallest: " + smallest);
    }
}
