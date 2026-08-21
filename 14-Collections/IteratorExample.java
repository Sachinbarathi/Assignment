import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("C");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
