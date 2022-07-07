package net.lite.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lite.tutorialmod.TutorialMod;
import net.lite.tutorialmod.item.custom.DowsingRodItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {




    public static final Item WOODEN_DOWSING_ROD = registerItem("wooden_dowsing_rod",
            new DowsingRodItem(new FabricItemSettings()
                    .group(ModItemGroup.Lite_Tools)
                    .maxDamage(16)
            ));

    public static final Item STONE_DOWSING_ROD = registerItem("stone_dowsing_rod",
            new DowsingRodItem(new FabricItemSettings()
                    .group(ModItemGroup.Lite_Tools)
                    .maxDamage(32)
            ));

    public static final Item IRON_DOWSING_ROD = registerItem("iron_dowsing_rod",
            new DowsingRodItem(new FabricItemSettings()
                    .group(ModItemGroup.Lite_Tools)
                    .maxDamage(64)
            ));

    public static final Item DIAMOND_DOWSING_ROD = registerItem("diamond_dowsing_rod",
            new DowsingRodItem(new FabricItemSettings()
                    .group(ModItemGroup.Lite_Tools)
                    .maxDamage(200)

            ));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.MYTHRIL)
            ));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.MYTHRIL)
            ));


    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings()
                    .group(ModItemGroup.MYTHRIL)
            ));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }


}
