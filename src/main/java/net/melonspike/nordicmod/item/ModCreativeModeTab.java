package net.melonspike.nordicmod.item;

import net.melonspike.nordicmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NORDIC_MATERIALS_TAB = new CreativeModeTab("nordicmaterialstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MYTHRIL.get());
        }
    };
    public static final CreativeModeTab NORDIC_BLOCKS_TAB = new CreativeModeTab("nordicblockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MYTHRIL_ORE.get());
        }
    };
}
