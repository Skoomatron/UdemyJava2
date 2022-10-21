package CarPolymorphism;

public class Holden extends Car {
    public Holden() {
        super(4, "Holden");
    }

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Holden engine is starting";
    }

    public String accelerate() {
        return "Holden is accelerating";
    }

    public String brake() {
        return "Holden is braking";
    }
}
