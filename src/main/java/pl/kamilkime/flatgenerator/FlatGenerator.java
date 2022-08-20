package pl.kamilkime.flatgenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.bukkit.Material;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlatGenerator extends JavaPlugin {

    private static final Pattern LAYER_SPLIT_PATTERN = Pattern.compile("\\s+");
    private final Map<String, List<Layer>> layers = new HashMap<>();

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getConfig().getConfigurationSection("layers").getKeys(false).forEach(world -> {
            this.layers.put(world, this.getConfig().getStringList("layers." + world).stream()
                    .map(LAYER_SPLIT_PATTERN::split)
                    .map(layer -> new Layer(
                            Integer.parseInt(layer[0]),
                            Integer.parseInt(layer[1]),
                            Material.matchMaterial(layer[2])
                    )).toList());
        });
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(final String worldName, final String id) {
        this.getLogger().info("This server is now using FlatChunkGenerator");
        return new FlatChunkGenerator(this.layers);
    }

}
