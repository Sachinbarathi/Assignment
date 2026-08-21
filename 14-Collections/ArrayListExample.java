import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sachin");
        names.add("Rahul");
        names.add("Kumar");

        System.out.println(names);
        System.out.println("First: " + names.get(0));
    }
}
