package org.shisito.friedrice.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.shisito.friedrice.FriedriceMod;
import org.shisito.friedrice.item.badges.Admin;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FriedriceMod.MOD_ID);

    public static final DeferredItem<Item> QUANTUM_TANGLED_SINGULARITY_FRAGMENT = ITEMS.register(
            "quantum_tangled_singularity_fragment", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> QUANTUM_TANGLED_CORE = ITEMS.register(
            "quantum_tangled_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RADIOACTIVE_ENERGY_CRYSTAL = ITEMS.register(
            "radioactive_energy_crystal", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RADIOACTIVE_ENERGY_CORE = ITEMS.register(
            "radioactive_energy_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPRESSED_DEBRIS = ITEMS.register(
            "compressed_debris", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPRESSED_ORE = ITEMS.register(
            "compressed_ore", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPRESSED_CRYSTAL = ITEMS.register(
            "compressed_crystal", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAGNIFICENT_CRYSTAL = ITEMS.register(
            "magnificent_crystal", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAGNIFICENT_CRYSTAL_CORE = ITEMS.register(
            "magnificent_crystal_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ADAMANT_TOFU_CHUNK = ITEMS.register(
            "adamant_tofu_chunk", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ADAMANT_TOFU_CORE = ITEMS.register(
            "adamant_tofu_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FOCUS_CORE = ITEMS.register(
            "focus_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MARK_CORE = ITEMS.register(
            "mark_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CREATIVITY_FRAGMENT = ITEMS.register(
            "creativity_fragment", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CREATIVITY_CORE = ITEMS.register(
            "creativity_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GEM_CORE = ITEMS.register(
            "gem_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPRESSED_BLUE = ITEMS.register(
            "compressed_blue", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLUE_FRAGMENT = ITEMS.register(
            "blue_fragment", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BLUE_CORE = ITEMS.register(
            "blue_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SPELL_ENHANCEMENT_CORE = ITEMS.register(
            "spell_enhancement_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EQUIPMENT_ENHANCEMENT_CORE = ITEMS.register(
            "equipment_enhancement_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANCIENT_RUNE_FRAGMENT = ITEMS.register(
            "ancient_rune_fragment", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUNE_CORE = ITEMS.register(
            "rune_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> YELLOW_FRAGMENT = ITEMS.register(
            "yellow_fragment", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> YELLOW_CORE = ITEMS.register(
            "yellow_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COSMIC_FRAGMENT = ITEMS.register(
            "cosmic_fragment", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COSMIC_CORE = ITEMS.register(
            "cosmic_core", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COMPRESSED_NETHERRACK = ITEMS.register(
            "compressed_netherrack",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RE_COMPRESSED_NETHERRACK = ITEMS.register(
            "re_compressed_netherrack",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RERE_COMPRESSED_NETHERRACK = ITEMS.register(
            "rere_compressed_netherrack",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RERERE_COMPRESSED_NETHERRACK = ITEMS.register(
            "rerere_compressed_netherrack",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHER_CORE = ITEMS.register(
            "nether_core",()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BADGE_ADMIN = ITEMS.register(
            "badge_admin", Admin::new);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
