class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s = new Student("Sachin", 20);
        s.display();
    }
}
