abstract class Vehicle {
    abstract void car();
    abstract void bike();
}

class VEHICLE extends Vehicle {
    void car() {
        System.out.println("car starts with key");
    }
    
    void bike() {
        System.out.println("bike starts with key");
    }
}

public class Main {
    public static void main(String[] args) {
        VEHICLE c = new VEHICLE();
        VEHICLE b = new VEHICLE();
        
        c.car();
        b.bike();
    }
}
