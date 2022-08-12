
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.BladerattackEntity;
import net.mcreator.cummod.client.model.ModelBlader_attack;

public class BladerattackRenderer extends MobRenderer<BladerattackEntity, ModelBlader_attack<BladerattackEntity>> {
	public BladerattackRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBlader_attack(context.bakeLayer(ModelBlader_attack.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BladerattackEntity entity) {
		return new ResourceLocation("cummod:textures/blader_attack_.png");
	}
}
