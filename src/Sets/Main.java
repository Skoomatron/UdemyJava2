package Sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBodies> solarSystem = new HashMap<>();
    private static Set<HeavenlyBodies> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBodies temp = new HeavenlyBodies("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        temp = new HeavenlyBodies("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        temp = new HeavenlyBodies("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        HeavenlyBodies tempMoon = new HeavenlyBodies("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        for(HeavenlyBodies bodies : planets) {
            System.out.println(bodies.getName() + " " + bodies.getSatellites());
        }
    }
}
