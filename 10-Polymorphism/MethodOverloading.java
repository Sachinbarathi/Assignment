class Printer {
    void print(int n) {
        System.out.println("Integer: " + n);
    }

    void print(String text) {
        System.out.println("String: " + text);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print("Java");
    }
}
