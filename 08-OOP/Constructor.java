class Student {
    String name;

    Student() {
        name = "Unknown";
    }

    void display() {
        System.out.println(name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
