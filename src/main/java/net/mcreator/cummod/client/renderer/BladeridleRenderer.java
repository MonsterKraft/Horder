
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.BladeridleEntity;
import net.mcreator.cummod.client.model.ModelBlader_idle;

public class BladeridleRenderer extends MobRenderer<BladeridleEntity, ModelBlader_idle<BladeridleEntity>> {
	public BladeridleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBlader_idle(context.bakeLayer(ModelBlader_idle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BladeridleEntity entity) {
		return new ResourceLocation("cummod:textures/blader_attack_.png");
	}
}
