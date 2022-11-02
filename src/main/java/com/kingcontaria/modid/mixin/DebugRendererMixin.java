package com.kingcontaria.modid.mixin;

import net.minecraft.client.render.debug.DebugRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DebugRenderer.class)
public class DebugRendererMixin {

    /**
     * @author KingContaria
     * @reason disable chunk border toggling bc of standardsettings
     */
    @Overwrite
    public boolean toggleShowChunkBorder() {
        return false;
    }
}