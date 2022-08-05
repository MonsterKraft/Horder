
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import net.mcreator.cummod.entity.BloodEntity;

public class BloodRenderer extends MobRenderer<BloodEntity, SlimeModel<BloodEntity>> {
	public BloodRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BloodEntity entity) {
		return new ResourceLocation("cummod:textures/sdas.png");
	}
}
