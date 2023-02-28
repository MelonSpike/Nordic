package net.melonspike.nordicmod.item;

import net.melonspike.nordicmod.NordicMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NordicMod.MOD_ID);

    public static final RegistryObject<Item> RAW_MYTHRIL =
            ITEMS.register("raw_mythril", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NORDIC_MATERIALS_TAB)));
    public static final RegistryObject<Item> MYTHRIL =
            ITEMS.register("mythril", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NORDIC_MATERIALS_TAB)));
    public static final RegistryObject<Item> RAW_SILVER =
            ITEMS.register("raw_silver", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NORDIC_MATERIALS_TAB)));
    public static final RegistryObject<Item> SILVER =
            ITEMS.register("silver", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NORDIC_MATERIALS_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
