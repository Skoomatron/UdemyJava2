package AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are on a craggy hill"));
        locations.put(1, new Location(1, "You are by a lake"));
        locations.put(2, new Location(2, "You fell down a pit"));
        locations.put(3, new Location(3, "BBBBBEEEEEEEEESSSS"));
        locations.put(4, new Location(4, "The void calls to you"));

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            loc = scanner.nextInt();
            if (!locations.containsKey(loc)) {
                System.out.println("Choose again, you've gone too far!");
                break;
            }
        }
    }
}
