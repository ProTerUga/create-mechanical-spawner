package com.oierbravo.create_mechanical_spawner.compat.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.RegisterRecipeHandlersEvent;
import net.minecraft.resources.ResourceLocation;

public class KubeJSCreateMechanicalExtruderPlugin extends KubeJSPlugin {


    @Override
    public void addRecipes(RegisterRecipeHandlersEvent event) {
        event.register(new ResourceLocation("create_mechanical_extruder:extruding"), ExtrudingRecipeJS::new);
    }
}