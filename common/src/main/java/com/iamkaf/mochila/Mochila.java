package com.iamkaf.mochila;

import com.iamkaf.mochila.registry.CreativeModeTabs;
import com.iamkaf.mochila.registry.Items;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public final class Mochila {
    public static final String MOD_ID = "mochila";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        LOGGER.info("Bag 'em up!");

        // Registries
        Items.init();
        CreativeModeTabs.init();
    }

    /**
     * Creates resource location in the mod namespace with the given path.
     */
    public static ResourceLocation resource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}