package Sets;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBodies {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodies> satellites;

    public HeavenlyBodies(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBodies> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HeavenlyBodies moon) {
        return this.satellites.add(moon);
    }
}
