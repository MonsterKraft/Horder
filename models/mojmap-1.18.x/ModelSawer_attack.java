// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSawer_attack<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sawer_attack"), "main");
	private final ModelPart saw2;
	private final ModelPart leg2;
	private final ModelPart arm2;
	private final ModelPart body;
	private final ModelPart eye;
	private final ModelPart saw3;
	private final ModelPart leg3;
	private final ModelPart arm3;

	public ModelSawer_attack(ModelPart root) {
		this.saw2 = root.getChild("saw2");
		this.leg2 = root.getChild("leg2");
		this.arm2 = root.getChild("arm2");
		this.body = root.getChild("body");
		this.eye = root.getChild("eye");
		this.saw3 = root.getChild("saw3");
		this.leg3 = root.getChild("leg3");
		this.arm3 = root.getChild("arm3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition saw2 = partdefinition.addOrReplaceChild("saw2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-14.5F, -1.1F, -26.95F, -1.2538F, -1.3367F, 1.1125F));

		PartDefinition cube_r1 = saw2
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 74).addBox(-7.0F, -7.0F, 0.0F, 14.0F, 14.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = saw2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0297F, -0.0315F, 0.7914F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(58, 40)
						.addBox(-7.0F, -3.0F, -8.0F, 9.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(2.0F, 12.0F, -7.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 40)
						.addBox(2.0F, -2.0F, -7.0F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2",
				CubeListBuilder.create().texOffs(46, 0)
						.addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(70, 20)
						.addBox(-3.0F, 5.0F, -9.0F, 6.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 74)
						.addBox(-2.0F, 14.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 12)
						.addBox(1.0F, 14.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 47)
						.addBox(-2.0F, 14.0F, -4.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 12)
						.addBox(1.0F, 14.0F, -4.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 53)
						.addBox(-3.0F, 25.0F, -7.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 40)
						.addBox(-3.0F, 25.0F, -4.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -14.0F, -2.0F, -1.5708F, 0.4677F, -1.683F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(74, 66)
						.addBox(-7.0F, 6.0F, -2.0F, 9.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-7.0F, -8.0F, -10.0F, 9.0F, 14.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = body
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -12.0F, 11.0F, 16.0F, 24.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition eye = partdefinition.addOrReplaceChild("eye", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.25F, -10.5F, -6.0F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition cube_r4 = eye.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(48, 66)
						.addBox(-6.0F, -4.0F, -5.0F, 8.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(2.0F, -3.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition saw3 = partdefinition.addOrReplaceChild("saw3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(14.5F, -1.1F, -26.95F, -1.2538F, 1.3367F, -1.1125F));

		PartDefinition cube_r5 = saw3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 74).mirror()
						.addBox(-7.0F, -7.0F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r6 = saw3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-5.0F, -5.0F, -1.0F, 10.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0297F, 0.0315F, -0.7914F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(58, 40).mirror()
				.addBox(-2.0F, -3.0F, -8.0F, 9.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 12)
				.mirror().addBox(-3.0F, 12.0F, -7.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 40).mirror().addBox(-3.0F, -2.0F, -7.0F, 1.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(2.0F, 9.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition arm3 = partdefinition.addOrReplaceChild("arm3", CubeListBuilder.create().texOffs(46, 0).mirror()
				.addBox(-7.2052F, -3.8859F, -8.7649F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(70, 20).mirror()
				.addBox(-5.2052F, 6.1141F, -7.7649F, 6.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(28, 74).mirror()
				.addBox(-1.2052F, 15.1141F, -5.7649F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 12).mirror()
				.addBox(-4.2052F, 15.1141F, -5.7649F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 47).mirror()
				.addBox(-1.2052F, 15.1141F, -2.7649F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 12).mirror()
				.addBox(-4.2052F, 15.1141F, -2.7649F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 53).mirror()
				.addBox(-5.2052F, 26.1141F, -5.7649F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 40).mirror()
				.addBox(-5.2052F, 26.1141F, -2.7649F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.0632F, -12.4047F, -0.0114F, -1.5708F, -0.4677F, 1.683F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		saw2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		saw3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.eye.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.eye.xRot = headPitch / (180F / (float) Math.PI);
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.saw2.yRot = ageInTicks;
		this.saw3.yRot = ageInTicks;
	}
}