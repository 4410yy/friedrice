package org.shisito.friedrice.data.recipes;

import mekanism.api.MekanismAPI;
import mekanism.common.registries.MekanismItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.shisito.friedrice.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {
    public RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHER_CORE)
                .define('#', ModItems.RERERE_COMPRESSED_NETHERRACK)
                .define('*', Items.NETHER_STAR)
                .define('-', MekanismItems.ANTIMATTER_PELLET)
                .pattern("""
                        #-#
                        ***
                        #-#
                        """)
                .save(recipeOutput);
    }
}
