public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
