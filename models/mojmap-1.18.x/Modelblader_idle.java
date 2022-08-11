// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelblader_idle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "blader_idle"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart L_L;
	private final ModelPart R_L;
	private final ModelPart L_A;
	private final ModelPart R_A;

	public Modelblader_idle(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.L_L = root.getChild("L_L");
		this.R_L = root.getChild("R_L");
		this.L_A = root.getChild("L_A");
		this.R_A = root.getChild("R_A");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -14.5F, 8.75F));

		PartDefinition Skin2 = Head.addOrReplaceChild("Skin2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.4936F, -7.0071F, -3.6589F, 0.2182F, 0.6109F, 0.0F));

		PartDefinition cube_r1 = Skin2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(23, 0)
						.addBox(0.5F, -3.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(4.0F, -3.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 65)
						.addBox(0.5F, -6.0F, -10.5F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(46, 45)
						.addBox(0.5F, -5.0F, -11.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 36)
						.addBox(4.0F, 0.0F, -5.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 66)
						.addBox(5.0F, -5.0F, -10.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4936F, 0.5071F, 0.7339F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r2 = Skin2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 50).addBox(-1.25F, -1.25F, 0.0F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5722F, 0.5071F, -7.4254F, 0.5672F, -0.48F, 0.0F));

		PartDefinition cube_r3 = Skin2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(86, 16).addBox(0.0F, -1.5F, -2.5F, 1.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0375F, 2.0071F, -2.0668F, -2.71F, -0.2052F, 0.1423F));

		PartDefinition cube_r4 = Skin2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(52, 65).addBox(-2.3747F, -3.119F, -0.6514F, 1.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.6092F, 3.5106F, -8.5644F, -1.4426F, 0.2804F, -0.062F));

		PartDefinition cube_r5 = Skin2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(74, 89)
						.addBox(-0.4601F, 2.5F, 0.6439F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(-0.4601F, -2.5F, -0.3561F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0188F, -1.9929F, 2.628F, 0.0F, -2.2689F, 0.0F));

		PartDefinition Scull = Head.addOrReplaceChild("Scull",
				CubeListBuilder.create().texOffs(0, 76)
						.addBox(-3.5F, -7.9727F, -5.226F, 7.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 0)
						.addBox(-3.0F, -7.4727F, -1.226F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-3.0F, -7.4727F, -0.226F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 56)
						.addBox(-3.5F, -6.9727F, -8.226F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 81)
						.addBox(-3.5F, -7.9727F, -7.226F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 56)
						.addBox(-1.5F, -1.9727F, -10.226F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.5273F, -3.524F));

		PartDefinition cube_r6 = Scull.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(28, 5).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -4.7227F, -8.726F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Scull.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -3.4727F, -7.726F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = Scull.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(14, 15).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -3.4727F, -7.726F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r9 = Scull.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(71, 10).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2227F, -8.976F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Scull.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(93, 26).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0273F, -8.226F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r11 = Scull.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(38, 93).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0273F, -8.226F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r12 = Scull.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.2773F, -8.176F, -0.1109F, -0.4449F, 0.2189F));

		PartDefinition cube_r13 = Scull.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(23, 30).addBox(-1.5F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 1.2773F, -8.176F, -0.1109F, 0.4449F, -0.2189F));

		PartDefinition cube_r14 = Scull.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(89, 50).addBox(-1.0F, -1.0324F, -0.1005F, 2.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4727F, 3.524F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Scull.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4727F, 2.274F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Scull.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(14, 15).addBox(-4.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.1273F, -4.726F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Skin = Head.addOrReplaceChild("Skin", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.4936F, -7.0071F, -3.6589F, 0.1814F, -0.5542F, -0.0951F));

		PartDefinition cube_r17 = Skin.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(28, 7)
						.addBox(-1.5F, -3.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 10)
						.addBox(-5.0F, -3.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 0)
						.addBox(-5.5F, -6.0F, -10.5F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(71, 45)
						.addBox(-5.5F, -5.0F, -11.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 88)
						.addBox(-5.0F, 0.0F, -5.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(75, 41)
						.addBox(-6.0F, -5.0F, -10.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4936F, 0.5071F, 0.7339F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r18 = Skin.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(23, 65).addBox(-2.75F, -1.25F, 0.0F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5722F, 0.5071F, -7.4254F, 0.5672F, 0.48F, 0.0F));

		PartDefinition cube_r19 = Skin.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(16, 88).addBox(-1.0F, -1.5F, -2.5F, 1.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0375F, 2.0071F, -2.0668F, -2.4365F, 0.2545F, -0.2215F));

		PartDefinition cube_r20 = Skin.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(71, 0).addBox(0.3093F, -2.7937F, -2.6413F, 1.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.724F, 6.0308F, -5.792F, -1.313F, -0.106F, 0.0692F));

		PartDefinition cube_r21 = Skin.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(84, 91)
						.addBox(-0.5399F, 2.5F, 0.6439F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 35)
						.addBox(-0.5399F, -2.5F, -0.3561F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0188F, -1.9929F, 2.628F, 0.0F, 2.2689F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.0F, 8.0F));

		PartDefinition cube_r22 = Body.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 10.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 0.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Body.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 65).addBox(-4.5F, -1.0F, -2.5F, 9.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(28, 65).addBox(-3.5F, -5.0F, -2.5F, 7.0F, 10.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition L_L = partdefinition.addOrReplaceChild("L_L", CubeListBuilder.create(),
				PartPose.offset(6.0F, 2.5F, 9.5F));

		PartDefinition cube_r25 = L_L.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(23, 35).addBox(4.5F, -3.0F, -2.5F, 4.0F, 6.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.0F, -2.0F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r26 = L_L.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(86, 36)
						.addBox(-3.0F, 4.0F, 0.0F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 19.4546F, -4.9389F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r27 = L_L.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(71, 23).addBox(-1.0F, -3.6954F, -0.4277F, 2.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 12.0F, -9.0F, -1.6581F, 0.0F, 0.0F));

		PartDefinition R_L = partdefinition.addOrReplaceChild("R_L", CubeListBuilder.create(),
				PartPose.offset(-6.5F, 3.0363F, 7.3358F));

		PartDefinition cube_r28 = R_L.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 20).addBox(-8.5F, -3.0F, -2.5F, 4.0F, 6.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 0.4637F, 0.1642F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r29 = R_L.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 88)
						.addBox(-3.0F, 4.0F, 0.0F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 83)
						.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.9183F, -2.7747F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r30 = R_L.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(71, 10).addBox(-1.0F, -3.6954F, -0.4277F, 2.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.4637F, -6.8358F, -1.6581F, 0.0F, 0.0F));

		PartDefinition L_A = partdefinition.addOrReplaceChild("L_A", CubeListBuilder.create(),
				PartPose.offset(4.0F, -13.5F, 9.5F));

		PartDefinition cube_r31 = L_A.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 56)
				.addBox(-1.811F, -1.2373F, -2.6301F, 14.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 50)
				.addBox(7.189F, -0.2373F, -12.6301F, 6.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(22, 80)
				.addBox(7.189F, -0.2373F, -18.6301F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
				.addBox(7.189F, 0.7627F, -37.6301F, 9.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(58, 89)
				.addBox(7.189F, -0.2373F, -30.6301F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(82, 59)
				.addBox(7.189F, -0.2373F, -24.6301F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0658F, 0.6795F, -1.4987F, 0.3899F, -0.6455F, 0.4508F));

		PartDefinition R_A = partdefinition.addOrReplaceChild("R_A", CubeListBuilder.create(),
				PartPose.offset(-4.0F, -13.5F, 9.5F));

		PartDefinition cube_r32 = R_A.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 81)
				.addBox(-11.189F, -0.2373F, -24.6301F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-16.189F, 0.7627F, -37.6301F, 9.0F, 0.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(82, 67)
				.addBox(-9.189F, -0.2373F, -30.6301F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
				.addBox(-12.189F, -1.2373F, -2.6301F, 14.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 35)
				.addBox(-13.189F, -0.2373F, -12.6301F, 6.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(46, 75)
				.addBox(-12.189F, -0.2373F, -18.6301F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0658F, 0.6795F, -1.4987F, 0.3899F, 0.6455F, -0.4508F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L_L.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R_L.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		L_A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		R_A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.R_A.xRot = headPitch / (180F / (float) Math.PI);
		this.L_L.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.R_L.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.L_A.xRot = headPitch / (180F / (float) Math.PI);
	}
}