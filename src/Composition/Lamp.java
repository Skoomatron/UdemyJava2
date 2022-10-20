package Composition;

public class Lamp {
    private String style;
    private boolean battery;
    private int lumens;

    public Lamp(String style, boolean battery, int lumens) {
        this.style = style;
        this.battery = battery;
        this.lumens = lumens;
    }

    public void turnOn() {
        System.out.println("Lamp is now on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getLumens() {
        return lumens;
    }
}
