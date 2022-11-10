package com.kingcontaria.modid;

import me.voidxwalker.worldpreview.WorldPreview;
import net.fabricmc.loader.api.FabricLoader;

public class WorldPreviewCompatibility {

    private static final boolean hasWorldPreview = FabricLoader.getInstance().isModLoaded("worldpreview");

    public static void noF3Esc() {
        if (hasWorldPreview) WorldPreview.showMenu = true;
    }
}