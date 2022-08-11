
package net.mcreator.cummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cummod.entity.SawerattackEntity;
import net.mcreator.cummod.client.model.ModelSawer_attack;

public class SawerattackRenderer extends MobRenderer<SawerattackEntity, ModelSawer_attack<SawerattackEntity>> {
	public SawerattackRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSawer_attack(context.bakeLayer(ModelSawer_attack.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SawerattackEntity entity) {
		return new ResourceLocation("cummod:textures/gfgfgf.png");
	}
}
