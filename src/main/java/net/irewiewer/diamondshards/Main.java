package net.irewiewer.diamondshards;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    
    // Mod ID
    public static final String modid = "diamond_shards";

    // Instance of diamond_shard item
    public static final Item diamond_shard = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

    @Override
    public void onInitialize() {
        // Register item entry
        Registry.register(Registry.ITEM, new Identifier(modid, "diamond_shard"), diamond_shard);
    }
}