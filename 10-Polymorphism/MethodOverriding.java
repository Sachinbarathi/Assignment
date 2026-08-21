class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves on road");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.move();
    }
}
