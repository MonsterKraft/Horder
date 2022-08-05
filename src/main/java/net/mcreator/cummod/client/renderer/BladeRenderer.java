
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.BladeEntity;
import net.mcreator.cummod.client.model.Modelcustom_model;

public class BladeRenderer extends MobRenderer<BladeEntity, Modelcustom_model<BladeEntity>> {
	public BladeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(BladeEntity entity) {
		return new ResourceLocation("cummod:textures/ashchk_av.png");
	}
}
