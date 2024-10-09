package org.shisito.friedrice.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.shisito.friedrice.FriedriceMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FriedriceMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FRIEDRICE_ITEMS_TAB = CREATIVE_MODE_TAB.register("friedrice_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COSMIC_CORE.get()))
                    .title(Component.translatable("creativetab.friedricemod.friedrice_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
//                      ここにタブアイテムを追加
                        output.accept(ModItems.QUANTUM_TANGLED_SINGULARITY_FRAGMENT);
                        output.accept(ModItems.QUANTUM_TANGLED_CORE);
                        output.accept(ModItems.RADIOACTIVE_ENERGY_CRYSTAL);
                        output.accept(ModItems.RADIOACTIVE_ENERGY_CORE);
                        output.accept(ModItems.COMPRESSED_DEBRIS);
                        output.accept(ModItems.COMPRESSED_ORE);
                        output.accept(ModItems.COMPRESSED_CRYSTAL);
                        output.accept(ModItems.MAGNIFICENT_CRYSTAL);
                        output.accept(ModItems.MAGNIFICENT_CRYSTAL_CORE);
                        output.accept(ModItems.ADAMANT_TOFU_CHUNK);
                        output.accept(ModItems.ADAMANT_TOFU_CORE);
                        output.accept(ModItems.FOCUS_CORE);
                        output.accept(ModItems.MARK_CORE);
                        output.accept(ModItems.CREATIVITY_FRAGMENT);
                        output.accept(ModItems.CREATIVITY_CORE);
                        output.accept(ModItems.GEM_CORE);
                        output.accept(ModItems.COMPRESSED_BLUE);
                        output.accept(ModItems.BLUE_FRAGMENT);
                        output.accept(ModItems.BLUE_CORE);
                        output.accept(ModItems.SPELL_ENHANCEMENT_CORE);
                        output.accept(ModItems.EQUIPMENT_ENHANCEMENT_CORE);
                        output.accept(ModItems.ANCIENT_RUNE_FRAGMENT);
                        output.accept(ModItems.RUNE_CORE);
                        output.accept(ModItems.YELLOW_FRAGMENT);
                        output.accept(ModItems.YELLOW_CORE);
                        output.accept(ModItems.COSMIC_FRAGMENT);
                        output.accept(ModItems.COSMIC_CORE);
                        output.accept(ModItems.COMPRESSED_NETHERRACK);
                        output.accept(ModItems.RE_COMPRESSED_NETHERRACK);
                        output.accept(ModItems.RERE_COMPRESSED_NETHERRACK);
                        output.accept(ModItems.RERERE_COMPRESSED_NETHERRACK);
                        output.accept(ModItems.NETHER_CORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
