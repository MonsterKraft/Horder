
package net.mcreator.cummod.client.renderer;

public class BladerattackRenderer extends MobRenderer<BladerattackEntity, Modelblader_attack<BladerattackEntity>> {

	public BladerattackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblader_attack(context.bakeLayer(Modelblader_attack.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BladerattackEntity entity) {
		return new ResourceLocation("cummod:textures/drgfa.png");
	}

}
