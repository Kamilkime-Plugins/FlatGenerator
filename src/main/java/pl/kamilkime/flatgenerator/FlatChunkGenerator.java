package pl.kamilkime.flatgenerator;

import java.util.List;
import java.util.Map;
import java.util.Random;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;

public class FlatChunkGenerator extends ChunkGenerator {

    private final Map<String, List<Layer>> layers;

    public FlatChunkGenerator(final Map<String, List<Layer>> layers) {
        this.layers = layers;
    }

    @Override
    public void generateNoise(final WorldInfo worldInfo, final Random random, final int chunkX, final int chunkZ, final ChunkData chunkData) {
        final List<Layer> worldLayers = this.layers.get(worldInfo.getName());
        if (worldLayers == null) {
            super.generateNoise(worldInfo, random, chunkX, chunkZ, chunkData);
            return;
        }

        worldLayers.forEach(layer -> chunkData.setRegion(0, layer.minY(), 0, 16, layer.maxY() + 1, 16, layer.layerType()));
    }

}
