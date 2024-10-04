package RPCraft.rPCraft;

import org.bukkit.Location;

public class City {
    String name;
    Location spawn;
    int level;

    public City(String name, Location spawn) {
        this.name = name;
        this.spawn = spawn;
        this.level = 1;
    }
}
