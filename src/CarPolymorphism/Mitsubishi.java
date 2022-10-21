package CarPolymorphism;

public class Mitsubishi extends Car {
    public Mitsubishi() {
        super(5, "Mitsubishi");
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Mitsubishi engine is starting";
    }

    public String accelerate() {
        return "Mitsubishi is accelerating";
    }

    public String brake() {
        return "Mitsubishi is braking";
    }
}
