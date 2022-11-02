package com.kingcontaria.modid.mixin;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {

    /**
     * @author KingContaria
     * @reason disable chunk hitbox toggling bc of standardsettings
     */
    @Overwrite
    public void setRenderHitboxes(boolean value) {
    }
}