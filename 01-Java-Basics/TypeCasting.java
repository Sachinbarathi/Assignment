public class TypeCasting {
    public static void main(String[] args) {
        int number = 100;
        double converted = number;

        double value = 99.99;
        int result = (int) value;

        System.out.println("Widening: " + converted);
        System.out.println("Narrowing: " + result);
    }
}
