package net.lite.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lite.tutorialmod.TutorialMod;
import net.lite.tutorialmod.item.ModItemGroup;
import net.lite.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(7f)
                    .requiresTool()


            ), ModItemGroup.MYTHRIL);



    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)


            ), ModItemGroup.MYTHRIL);

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(9f)


            ), ModItemGroup.MYTHRIL);

    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(6f)


            ), ModItemGroup.MYTHRIL);

    public static final Block NETHERRACK_MYTHRIL_ORE = registerBlock("netherrack_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(5f)


            ), ModItemGroup.MYTHRIL);



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }



    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Blocks for " + TutorialMod.MOD_ID);
    }



}
