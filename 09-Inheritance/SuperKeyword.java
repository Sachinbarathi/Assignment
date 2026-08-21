class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;

    void display() {
        System.out.println("Child: " + value);
        System.out.println("Parent: " + super.value);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        new Child().display();
    }
}
