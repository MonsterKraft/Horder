
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.BladerattackEntity;
import net.mcreator.cummod.client.model.Modelblader_attack;

public class BladerattackRenderer extends MobRenderer<BladerattackEntity, Modelblader_attack<BladerattackEntity>> {
	public BladerattackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblader_attack(context.bakeLayer(Modelblader_attack.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BladerattackEntity entity) {
		return new ResourceLocation("cummod:textures/drgfa.png");
	}
}
