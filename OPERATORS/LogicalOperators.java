public class LogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean hasId = true;

        System.out.println(age >= 18 && hasId);
        System.out.println(age < 18 || hasId);
        System.out.println(!hasId);
    }
}
