package net.Redd56.sugifabric;

import net.Redd56.sugifabric.blocks.SaplingSugi;
import net.Redd56.sugifabric.blocks.DoorSugi;
import net.Redd56.sugifabric.blocks.LeavesSugiFallen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Main implements ModInitializer {

	//			LOGS

	public static final Block LOG_SUGI = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES)

	);
	public static final Block STRIPPED_LOG_SUGI = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES)

	);

	public static final Block WOOD_SUGI = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES)

	);
	public static final Block STRIPPED_WOOD_SUGI = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES)

	);




		// OTHER BLOCKS
	public static final Block PLANKS_SUGI = new Block(FabricBlockSettings.of(Material.WOOD, MaterialColor.SAND).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES));

	public static final Block LEAVES_SUGI = new LeavesBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().blockVision((state, world, pos) -> false).suffocates((state, world, pos) -> false).breakByTool(FabricToolTags.HOES));

	public static final Block LEAVES_FALLEN_SUGI = new LeavesSugiFallen(FabricBlockSettings.of(Material.LEAVES).strength(0.2F).sounds(BlockSoundGroup.GRASS).nonOpaque().breakByTool(FabricToolTags.HOES).suffocates((state, world, pos) -> false));

	public static final SaplingSugi SAPLING_SUGI = new SaplingSugi(new SaplingSugiGenerator(), AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().nonOpaque().sounds(BlockSoundGroup.GRASS));

	public static final Block DOOR_SUGI = new DoorSugi(FabricBlockSettings.of(Material.WOOD, MaterialColor.SAND).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f).nonOpaque());

	public static final Block SLAB_SUGI = new SlabBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.SAND).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));

	public static final Block FENCE_SUGI = new FenceBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.SAND).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));

	public static final Block FENCE_GATE_SUGI =  new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, MaterialColor.SAND).sounds(BlockSoundGroup.WOOD).strength(2.0f, 3.0f));


	@Override
	public void onInitialize() {
		registerLogBlocks();
		registerOtherBlocks();
		registerOtherBlockStuff();
		ReddConfiguredFeatures.registerConfiguredFeatures();
		FabricSugiStrippables.strippableLogsFabricSugi();
	}



	private void registerLogBlocks() {
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "log_sugi"), LOG_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "log_sugi"), new BlockItem(LOG_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "stripped_log_sugi"),STRIPPED_LOG_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "stripped_log_sugi"), new BlockItem(STRIPPED_LOG_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "wood_sugi"), WOOD_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "wood_sugi"), new BlockItem(WOOD_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "stripped_wood_sugi"), STRIPPED_WOOD_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "stripped_wood_sugi"), new BlockItem(STRIPPED_WOOD_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
	}
	private void registerOtherBlocks() {
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "planks_sugi"), PLANKS_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "planks_sugi"), new BlockItem(PLANKS_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "leaves_sugi"),LEAVES_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "leaves_sugi"), new BlockItem(LEAVES_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "leaves_fallen_sugi"), LEAVES_FALLEN_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "leaves_fallen_sugi"), new BlockItem(LEAVES_FALLEN_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric", "sapling_sugi"),SAPLING_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "sapling_sugi"), new BlockItem(SAPLING_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric","door_sugi"),DOOR_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "door_sugi"), new BlockItem(DOOR_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric","slab_sugi"),SLAB_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "slab_sugi"), new BlockItem(SLAB_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric","fence_sugi"),FENCE_SUGI);
		Registry.register(Registry.ITEM, new Identifier("sugifabric", "fence_sugi"), new BlockItem(FENCE_SUGI, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("sugifabric","fence_gate_sugi"), FENCE_GATE_SUGI);
	}
	private void registerOtherBlockStuff() {
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view,pos),LEAVES_SUGI);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> MaterialColor.GRASS.color,LEAVES_SUGI);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view,pos), LEAVES_FALLEN_SUGI);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> MaterialColor.GRASS.color, LEAVES_FALLEN_SUGI);
		BlockRenderLayerMap.INSTANCE.putBlock(SAPLING_SUGI, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(LEAVES_FALLEN_SUGI, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(DOOR_SUGI, RenderLayer.getCutout());
	}
}
