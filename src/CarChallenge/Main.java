package CarChallenge;

public class Main {
    public static void main(String[] args) {
        SUV myCar = new SUV(3);
        myCar.accelerate(30);
        myCar.accelerate(20);
        myCar.steer(180);
        myCar.accelerate(-15);

    }
}
