import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sachin");
        students.put(102, "Rahul");
        students.put(103, "Kumar");

        System.out.println(students);
        System.out.println(students.get(101));
    }
}
