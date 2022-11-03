package com.kingcontaria.modid.mixin;

import net.minecraft.client.item.TooltipContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TooltipContext.Default.class)
public class ToolTipContextMixin {

    /**
     * @author KingContaria
     * @reason disable advancedItemTooltips
     */
    @Overwrite
    public boolean isAdvanced() {
        return false;
    }
}