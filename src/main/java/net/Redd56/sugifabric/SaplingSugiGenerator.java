package net.Redd56.sugifabric;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SaplingSugiGenerator  extends SaplingGenerator {
    public SaplingSugiGenerator() {
    }

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
        return (ConfiguredFeature<TreeFeatureConfig, ?>) ReddConfiguredFeatures.TREE_SUGI;
    }
}

