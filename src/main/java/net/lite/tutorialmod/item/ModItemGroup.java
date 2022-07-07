package net.lite.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lite.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "mythril"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));

    public static final ItemGroup Lite_Tools = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "lite_tools"),
            () -> new ItemStack(ModItems.WOODEN_DOWSING_ROD));


}
