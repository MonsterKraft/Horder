
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.BladeridleEntity;
import net.mcreator.cummod.client.model.Modelblader_idle;

public class BladeridleRenderer extends MobRenderer<BladeridleEntity, Modelblader_idle<BladeridleEntity>> {
	public BladeridleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblader_idle(context.bakeLayer(Modelblader_idle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BladeridleEntity entity) {
		return new ResourceLocation("cummod:textures/drgfa.png");
	}
}
