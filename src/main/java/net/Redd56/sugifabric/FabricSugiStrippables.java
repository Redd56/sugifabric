package net.Redd56.sugifabric;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;

public class FabricSugiStrippables {
    public static void strippableBlock(Block logSugiFabric, Block strippableSugiFabric) {
        AxeItem.STRIPPED_BLOCKS = Maps.newHashMap(AxeItem.STRIPPED_BLOCKS);
        AxeItem.STRIPPED_BLOCKS.put(logSugiFabric, strippableSugiFabric);
    }
    public static void strippableLogsFabricSugi() {
        strippableBlock(Main.LOG_SUGI, Main.STRIPPED_LOG_SUGI);
    }
}
