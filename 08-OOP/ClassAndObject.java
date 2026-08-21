class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Sachin";
        student.age = 20;
        student.display();
    }
}
