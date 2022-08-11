
package net.mcreator.cummod.client.renderer;

public class BladeridleRenderer extends MobRenderer<BladeridleEntity, Modelblader_idle<BladeridleEntity>> {

	public BladeridleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblader_idle(context.bakeLayer(Modelblader_idle.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BladeridleEntity entity) {
		return new ResourceLocation("cummod:textures/drgfa.png");
	}

}
