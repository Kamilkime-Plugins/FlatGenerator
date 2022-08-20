package pl.kamilkime.flatgenerator;

import org.bukkit.Material;

public record Layer(int minY, int maxY, Material layerType) {}
