package net.Redd56.sugifabric;

import net.minecraft.block.BlockState;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ReddConfiguredFeatures {
    private static <FC extends FeatureConfig> ConfiguredFeature register(String id, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, id, configuredFeature);
    }



    public static ConfiguredFeature<?,?> TREE_SUGI;



    public static void registerConfiguredFeatures() {
        TREE_SUGI = register("sugifabric:tree_sugi",  Feature.TREE.configure(
                (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.SUGI_LOG),
                        new SimpleBlockStateProvider(ReddConfiguredFeatures.States.SUGI_LEAVES),
                        new BlobFoliagePlacer(UniformIntDistribution.of(3), UniformIntDistribution.of(0), 8),
                        new StraightTrunkPlacer(20, 25, 10),
                        new TwoLayersFeatureSize(0, 0, 0))).ignoreVines().build()));
    }


    public static final class States {
        protected static final BlockState SUGI_LOG = Main.LOG_SUGI.getDefaultState();
        protected static final BlockState SUGI_LEAVES = Main.LEAVES_SUGI.getDefaultState();
    }
}
