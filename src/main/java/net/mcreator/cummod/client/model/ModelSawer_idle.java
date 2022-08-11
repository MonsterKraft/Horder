package net.mcreator.cummod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSawer_idle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cummod", "model_sawer_idle"), "main");
	public final ModelPart body;
	public final ModelPart arm;
	public final ModelPart leg;
	public final ModelPart eye;
	public final ModelPart leg2;
	public final ModelPart arm2;

	public ModelSawer_idle(ModelPart root) {
		this.body = root.getChild("body");
		this.arm = root.getChild("arm");
		this.leg = root.getChild("leg");
		this.eye = root.getChild("eye");
		this.leg2 = root.getChild("leg2");
		this.arm2 = root.getChild("arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(74, 66).addBox(-7.0F, 6.0F, -2.0F, 9.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-7.0F, -8.0F, -10.0F, 9.0F, 14.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -12.0F, 11.0F, 16.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition arm = partdefinition.addOrReplaceChild("arm",
				CubeListBuilder.create().texOffs(46, 0).addBox(-3.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(70, 20)
						.addBox(-1.0F, 5.0F, 1.0F, 6.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 74)
						.addBox(0.0F, 14.0F, 6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 12)
						.addBox(3.0F, 14.0F, 6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 47)
						.addBox(0.0F, 14.0F, 3.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 12)
						.addBox(3.0F, 14.0F, 3.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 53)
						.addBox(-1.0F, 25.0F, 6.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 40).addBox(-1.0F, 25.0F, 3.0F, 6.0F,
								6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -14.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition saw = arm.addOrReplaceChild("saw", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, -12.0F));
		PartDefinition cube_r2 = saw.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 74).addBox(-7.0F, -7.0F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -5.0F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.0F, 17.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg",
				CubeListBuilder.create().texOffs(58, 40).addBox(-6.9651F, -2.0F, 0.0003F, 9.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(2.0349F, 13.0F, 1.0003F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 40)
						.addBox(2.0349F, -1.0F, 1.0003F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 8.0F, 0.0F, -3.1416F, 1.5533F, 3.1416F));
		PartDefinition eye = partdefinition.addOrReplaceChild("eye", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.25F, -9.5F, -5.0F, -1.5708F, 1.0472F, -1.5708F));
		PartDefinition cube_r3 = eye.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(48, 66).addBox(-6.0F, -4.0F, -5.0F, 8.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(2.0F, -3.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(58, 40).mirror().addBox(-2.0349F, -2.0F, 0.0003F, 9.0F, 18.0F, 8.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 12).mirror().addBox(-3.0349F, 13.0F, 1.0003F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(38, 40).mirror().addBox(-3.0349F, -1.0F, 1.0003F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.0F, 8.0F, 0.0F, -3.1416F, -1.5533F, -3.1416F));
		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2",
				CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-7.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(70, 20).mirror().addBox(-5.0F, 5.0F, 1.0F, 6.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(28, 74).mirror().addBox(-1.0F, 14.0F, 6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(18, 12).mirror().addBox(-4.0F, 14.0F, 6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(52, 47).mirror().addBox(-1.0F, 14.0F, 3.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(14, 12).mirror().addBox(-4.0F, 14.0F, 3.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(38, 53).mirror().addBox(-5.0F, 25.0F, 6.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(52, 40).mirror().addBox(-5.0F, 25.0F, 3.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.0F, -14.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition saw2 = arm2.addOrReplaceChild("saw2", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, -12.0F));
		PartDefinition cube_r4 = saw2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-7.0F, -7.0F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(0, 0).mirror().addBox(-5.0F, -5.0F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-2.0F, 10.0F, 17.0F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye.xRot = headPitch / (180F / (float) Math.PI);
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.arm2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
