package org.shisito.friedrice.item.badges;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Scoreboard;
import net.neoforged.neoforge.event.level.NoteBlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.Objects;

public class Admin extends Item implements ICurioItem {
    public Admin() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        if (slotContext.entity() instanceof ServerPlayer player){
//            音をならすだけ いけた
//            player.level().playSound(null,player.blockPosition(), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS);

//            もう疲れた いけない
//            Objects.requireNonNull(player.getTeam()).setPlayerPrefix(Component.literal("[admin]"));

//            なにをしようとしてるかわからなくなってきた
//            Scoreboard scoreboard = player.getScoreboard();
//            PlayerTeam team = scoreboard.getPlayerTeam("friedrice_admin");
//            if (team == null) {
//                team = scoreboard.addPlayerTeam("friedrice_admin");
//                team.setDisplayName(Component.literal("ADMIN"));
//                team.setPlayerPrefix(Component.literal("[admin]"));
//            }
//
//            if (!Objects.requireNonNull(scoreboard.getPlayerTeam(player.getScoreboardName())).equals(team)){
//                scoreboard.addPlayerToTeam(player.getScoreboardName(), team);
//            }
        }
    }


//    オーバーライドできん
//    @Override
//    public void onUnequip(SlotContext slotContext, ItemStack stack) {
//        if (slotContext.entity() instanceof ServerPlayer player) {
//            Scoreboard scoreboard = player.getScoreboard();
//            PlayerTeam team = scoreboard.getPlayerTeam("friedrice_admin");
//            if (team != null && team.getPlayers().contains(player.getScoreboardName())){
//                scoreboard.removePlayerFromTeam(player.getScoreboardName(),team);
//            }
//        }
//    }
}
