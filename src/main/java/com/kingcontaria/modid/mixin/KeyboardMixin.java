package com.kingcontaria.modid.mixin;

import net.minecraft.client.Keyboard;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Keyboard.class)
public class KeyboardMixin {

     @Inject(method = "processF3", at = @At("HEAD"), cancellable = true)
     private void nof3_disableProcessingF3(CallbackInfoReturnable<Boolean> cir) {
          cir.setReturnValue(false);
     }

     @Redirect(method = "onKey", at = @At(value = "FIELD", target = "Lnet/minecraft/client/Keyboard;switchF3State:Z", ordinal = 0, opcode = Opcodes.GETFIELD))
     private boolean nof3_suppressF3(Keyboard keyboard) {
          return true;
     }
}