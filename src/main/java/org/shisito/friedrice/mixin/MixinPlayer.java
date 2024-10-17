package org.shisito.friedrice.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.entity.EntityAccess;
import org.shisito.friedrice.PrefixHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.random.RandomGenerator;

@Mixin({Player.class})
public abstract class MixinPlayer implements EntityAccess {

    @Unique
    private static final Map<UUID, String> hoge$playerPrefixes = new HashMap<>();

    @Inject(method = "getDisplayName", at = @At("RETURN"), cancellable = true)
    public void getDisplayName(CallbackInfoReturnable<Component> cir) {

        Component displayName = cir.getReturnValue();

        String prefix = PrefixHolder.prefixMap.getOrDefault(getUUID(), "");
//        uuidなどｦどうにかする。ikafのちからでた～のし～なかまが～～～～～zzz

        cir.setReturnValue(Component.literal(prefix).withColor(RandomGenerator.of("Random").nextInt()).append(displayName));
    }

}
