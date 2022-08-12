
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.SaweridleEntity;
import net.mcreator.cummod.client.model.ModelSawer_idle;

public class SaweridleRenderer extends MobRenderer<SaweridleEntity, ModelSawer_idle<SaweridleEntity>> {
	public SaweridleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSawer_idle(context.bakeLayer(ModelSawer_idle.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaweridleEntity entity) {
		return new ResourceLocation("cummod:textures/gfgfgf.png");
	}
}
