// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBlader_idle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "blader_idle"), "main");
	private final ModelPart Right_ribcage;
	private final ModelPart Left_ribcage;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Right_Arm;
	private final ModelPart Left_leg;
	private final ModelPart Neck;
	private final ModelPart Left_Arm;
	private final ModelPart Right_leg;

	public ModelBlader_idle(ModelPart root) {
		this.Right_ribcage = root.getChild("Right_ribcage");
		this.Left_ribcage = root.getChild("Left_ribcage");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.Right_Arm = root.getChild("Right_Arm");
		this.Left_leg = root.getChild("Left_leg");
		this.Neck = root.getChild("Neck");
		this.Left_Arm = root.getChild("Left_Arm");
		this.Right_leg = root.getChild("Right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Right_ribcage = partdefinition.addOrReplaceChild("Right_ribcage", CubeListBuilder.create(),
				PartPose.offset(1.75F, -8.5F, -3.0F));

		PartDefinition cube_r1 = Right_ribcage.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(44, 39).addBox(-2.1951F, -0.5623F, -1.2586F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2942F, 3.5826F, 1.0666F, 0.5307F, -0.9346F, -0.441F));

		PartDefinition cube_r2 = Right_ribcage.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(90, 13).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 2.7606F, -0.6903F, 0.4041F, -0.7001F, -0.2689F));

		PartDefinition cube_r3 = Right_ribcage.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(90, 59).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 1.5685F, -1.0662F, 0.5626F, -0.9719F, -0.4802F));

		PartDefinition cube_r4 = Right_ribcage.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(90, 75).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, 0.3763F, -1.4421F, 0.8835F, -1.1712F, -0.8429F));

		PartDefinition cube_r5 = Right_ribcage.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(90, 77).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -0.8158F, -1.818F, 0.8091F, -1.1423F, -0.7617F));

		PartDefinition cube_r6 = Right_ribcage.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(90, 79).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -2.008F, -2.1938F, 0.5626F, -0.9719F, -0.4802F));

		PartDefinition cube_r7 = Right_ribcage.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(90, 89).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -3.2001F, -2.5697F, 0.456F, -0.8192F, -0.3441F));

		PartDefinition Left_ribcage = partdefinition.addOrReplaceChild("Left_ribcage", CubeListBuilder.create(),
				PartPose.offset(-1.75F, -8.5F, -3.0F));

		PartDefinition cube_r8 = Left_ribcage.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(56, 13).addBox(-0.8049F, -0.5623F, -1.2586F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2942F, 3.5826F, 1.0666F, 0.5626F, 0.9719F, 0.4802F));

		PartDefinition cube_r9 = Left_ribcage.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(81, 7).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 2.7606F, -0.6903F, 0.4041F, 0.7001F, 0.2689F));

		PartDefinition cube_r10 = Left_ribcage.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(86, 73).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 1.5685F, -1.0662F, 0.5626F, 0.9719F, 0.4802F));

		PartDefinition cube_r11 = Left_ribcage.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(88, 85).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.3763F, -1.4421F, 0.8835F, 1.1712F, 0.8429F));

		PartDefinition cube_r12 = Left_ribcage.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(89, 41).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -0.8158F, -1.818F, 0.8091F, 1.1423F, 0.7617F));

		PartDefinition cube_r13 = Left_ribcage.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(90, 0).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -2.008F, -2.1938F, 0.5626F, 0.9719F, 0.4802F));

		PartDefinition cube_r14 = Left_ribcage.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(90, 87).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -3.2001F, -2.5697F, 0.456F, 0.8192F, 0.3441F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(30, 0)
						.addBox(-5.0F, -2.0F, -4.0F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(6, 90)
						.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 1.0F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(55, 2)
						.addBox(-4.0F, 3.1F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(-3.0F, 3.6F, -3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 73)
						.addBox(0.0F, 3.1F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 81)
						.addBox(-4.5F, 2.35F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 83)
						.addBox(0.5F, 2.35F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(-3.0F, -5.9F, -3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 52)
						.addBox(-4.5F, -5.65F, -3.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 74)
						.addBox(-0.5F, -5.65F, -3.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 86)
						.addBox(-5.0F, -5.15F, -4.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 80)
						.addBox(-1.0F, -3.0F, 3.0F, 0.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 75)
						.addBox(-2.5F, -3.0F, 2.0F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 83)
						.addBox(3.5F, -5.75F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 84)
						.addBox(-6.5F, -5.75F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -6.0F, -3.0F, 10.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 29)
						.addBox(-5.5F, -6.5F, -2.5F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 88)
						.addBox(1.0F, -5.15F, -4.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(34, 43)
						.addBox(0.0F, -6.0F, 3.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 62)
						.addBox(-1.5F, -6.0F, 2.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 45)
						.addBox(-3.5F, -5.75F, -2.25F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 7)
						.addBox(-4.0F, -6.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(50, 39).addBox(-3.0F, -0.5F, -2.5F, 6.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8026F, 3.3389F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(30, 4)
						.addBox(0.0F, -4.0F, -2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(73, 66)
						.addBox(-2.5F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.717F, -0.0917F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 18)
						.addBox(-3.0F, -3.9909F, -4.7716F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(80, 9)
						.addBox(2.25F, -3.4909F, -4.2716F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 79)
						.addBox(-3.25F, -3.4909F, -4.2716F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 60)
						.addBox(-2.5F, -4.4909F, -4.2716F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 34)
						.addBox(-3.0F, 5.0091F, -4.7716F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 41)
						.addBox(-2.5F, 5.3091F, -4.2716F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-1.0F, 0.0091F, -5.0216F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 57)
						.addBox(-0.5F, -1.9909F, -5.0216F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 55)
						.addBox(-2.75F, -2.9909F, -5.0216F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(89, 21)
						.addBox(0.75F, -2.9909F, -5.0216F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -19.0091F, -6.2284F));

		PartDefinition cube_r19 = Head.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(68, 8).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0091F, -1.5216F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Head.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(70, 29).addBox(-6.0F, -1.0F, -2.0F, 5.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 6.5091F, -1.7716F, 0.0F, 0.1745F, 1.4835F));

		PartDefinition cube_r21 = Head.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(70, 62).addBox(0.8038F, -0.9826F, -1.9654F, 5.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 6.3091F, -1.7716F, 0.0F, -0.1745F, -1.4835F));

		PartDefinition cube_r22 = Head.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(70, 70).addBox(-2.5F, -1.0F, -3.0F, 5.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.2091F, -1.5216F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Right_Arm = partdefinition.addOrReplaceChild("Right_Arm",
				CubeListBuilder.create().texOffs(24, 48).addBox(0.2815F, 2.4925F, -1.1135F, 3.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4685F, -12.6917F, -1.3407F, 0.0F, -0.2618F, -0.2182F));

		PartDefinition cube_r23 = Right_Arm.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(67, 21).addBox(-0.5F, -4.0F, 0.0F, 7.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5315F, -1.616F, 0.7157F, 0.3136F, 0.1246F, 0.0399F));

		PartDefinition cube_r24 = Right_Arm.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(68, 0).addBox(-0.5F, -4.0F, 0.0F, 7.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5315F, -1.0146F, -1.1918F, 0.3099F, -0.1664F, -0.053F));

		PartDefinition cube_r25 = Right_Arm.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(86, 25)
						.addBox(8.5F, -5.25F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 57)
						.addBox(6.0F, -5.75F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(5.5F, -6.25F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4685F, 3.6917F, 1.3407F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Right_Arm.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(64, 71).addBox(-0.0886F, -8.2063F, -0.3986F, 0.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5315F, 2.5272F, -0.8394F, 0.2773F, -0.1298F, 0.4269F));

		PartDefinition cube_r27 = Right_Arm.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 75).addBox(1.1F, -6.4F, -2.3F, 0.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7815F, -3.2228F, -0.8394F, 0.1146F, -0.2648F, 1.0781F));

		PartDefinition da = Right_Arm.addOrReplaceChild("da",
				CubeListBuilder.create().texOffs(50, 70)
						.addBox(-2.0F, -0.2034F, -3.1321F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 75)
						.addBox(-1.5F, 4.7966F, -2.6321F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7815F, 9.6958F, 2.7686F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r28 = da.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(86, 32).addBox(-2.0F, -0.0455F, -0.0563F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.8234F, -2.9738F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r29 = da.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(85, 68)
						.addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 9)
						.addBox(0.0F, -2.5F, -2.5F, 0.0F, 21.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(78, 45)
						.addBox(-1.0F, 0.5F, -1.5F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2966F, 1.3679F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r30 = da.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(54, 45).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.7966F, -2.6321F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone4 = da.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.75F, 15.7638F, -3.348F, -0.7738F, 0.0436F, 0.5219F));

		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(66, 89).addBox(-0.0105F, -0.2988F, 0.5142F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8852F, 0.7702F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone4
				.addOrReplaceChild("cube_r32",
						CubeListBuilder.create().texOffs(12, 38).addBox(-0.5F, -0.1544F, -0.5423F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition bone = da.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.25F, 16.2638F, -5.7579F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(70, 89).addBox(0.0F, -0.3266F, -1.8647F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3974F, -2.2536F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone
				.addOrReplaceChild("cube_r34",
						CubeListBuilder.create().texOffs(49, 18).addBox(-0.5F, -0.1544F, -0.4577F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone2 = da.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 16.2638F, -5.7579F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(14, 90).addBox(0.0F, -0.7614F, -0.9254F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3852F, -2.661F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r36 = bone2
				.addOrReplaceChild("cube_r36",
						CubeListBuilder.create().texOffs(0, 50).addBox(-0.5F, -0.1544F, -0.4577F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone3 = da.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.25F, 16.2638F, -5.7579F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(18, 90).addBox(0.0F, -0.393F, -1.1962F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7765F, -2.8978F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone3
				.addOrReplaceChild("cube_r38",
						CubeListBuilder.create().texOffs(52, 7).addBox(-0.5F, -0.1544F, -0.4577F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Left_leg = partdefinition.addOrReplaceChild("Left_leg",
				CubeListBuilder.create().texOffs(0, 38)
						.addBox(-2.0F, 0.0F, -2.75F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 33)
						.addBox(1.5F, 0.5F, -2.25F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 3.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition dl = Left_leg.addOrReplaceChild("dl",
				CubeListBuilder.create().texOffs(54, 15)
						.addBox(-0.875F, 4.0F, -0.875F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 49)
						.addBox(-1.625F, 0.0F, -1.125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, 8.0F, -1.375F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r39 = dl.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(16, 39)
						.addBox(-0.5F, -4.0154F, -3.8478F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 84)
						.addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.375F, -0.2981F, -1.0534F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r40 = dl.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(74, 85).addBox(-2.0F, -6.0F, -3.25F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.625F, 6.1789F, -7.6993F, 0.8172F, 0.1396F, -0.1682F));

		PartDefinition cube_r41 = dl.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(82, 85).addBox(0.0F, -6.0F, -3.25F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.625F, 6.1789F, -7.6993F, 0.812F, -0.1671F, 0.2024F));

		PartDefinition cube_r42 = dl.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(38, 64)
						.addBox(-2.0F, -1.0F, -3.25F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 65)
						.addBox(-1.5F, 0.0F, -3.25F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.625F, 6.1789F, -7.6993F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r43 = dl.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(10, 74).addBox(-1.5F, -6.8577F, -1.5199F, 2.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.125F, 11.8577F, 0.6449F, 1.4835F, 0.0F, 0.0F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck", CubeListBuilder.create(),
				PartPose.offset(0.0F, -15.0F, -1.5F));

		PartDefinition cube_r44 = Neck.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(88, 16).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.7923F, -3.0431F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r45 = Neck.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(89, 36).addBox(-1.5F, -2.5F, -1.0F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.7923F, -3.0431F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Neck.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(78, 56).addBox(-2.0F, -3.2032F, -1.0611F, 4.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0025F, -2.4822F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Neck.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(86, 43).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.731F, -2.5498F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Neck.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(54, 26).addBox(-2.5F, -3.0289F, -1.4377F, 5.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0025F, -0.4822F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Neck.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(86, 48).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -0.7435F, -1.1987F, 0.7691F, 0.3474F, -0.3382F));

		PartDefinition cube_r50 = Neck.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(42, 87).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -0.7435F, -1.1987F, 0.7691F, -0.3474F, 0.3382F));

		PartDefinition Left_Arm = partdefinition.addOrReplaceChild("Left_Arm",
				CubeListBuilder.create().texOffs(40, 42).addBox(-3.2815F, 2.4925F, -1.1135F, 3.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4685F, -12.6917F, -1.3407F, 0.0F, 0.2618F, 0.2182F));

		PartDefinition cube_r51 = Left_Arm.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(65, 33).addBox(-6.5F, -4.0F, 0.0F, 7.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5315F, -1.616F, 0.7157F, 0.3136F, -0.1246F, -0.0399F));

		PartDefinition cube_r52 = Left_Arm.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(66, 13).addBox(-6.5F, -4.0F, 0.0F, 7.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5315F, -1.0146F, -1.1918F, 0.3099F, 0.1664F, 0.053F));

		PartDefinition cube_r53 = Left_Arm.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(86, 6)
						.addBox(-9.5F, -5.25F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 55)
						.addBox(-9.0F, -5.75F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-6.5F, -6.25F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4685F, 3.6917F, 1.3407F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r54 = Left_Arm.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(20, 71).addBox(0.0886F, -8.2063F, -0.3986F, 0.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5315F, 2.5272F, -0.8394F, 0.2773F, 0.1298F, -0.4269F));

		PartDefinition cube_r55 = Left_Arm.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(52, 74).addBox(-1.1F, -6.4F, -2.3F, 0.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7815F, -3.2228F, -0.8394F, 0.1146F, 0.2648F, -1.0781F));

		PartDefinition da2 = Left_Arm.addOrReplaceChild("da2",
				CubeListBuilder.create().texOffs(64, 54)
						.addBox(-2.0F, -0.2034F, -3.1321F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 74)
						.addBox(-1.5F, 4.7966F, -2.6321F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7815F, 9.6958F, 2.7686F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r56 = da2.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(50, 66).addBox(-2.0F, -0.0455F, -0.0563F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.8234F, -2.9738F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r57 = da2.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(0.0F, -2.5F, -2.5F, 0.0F, 21.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 76)
						.addBox(-1.0F, 0.5F, -1.5F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2966F, 1.3679F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = da2.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(40, 34).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.7966F, -2.6321F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = da2.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.75F, 15.7638F, -3.348F, -0.7738F, -0.0436F, -0.5219F));

		PartDefinition cube_r59 = bone5.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(38, 89).addBox(0.0105F, -0.2988F, 0.5142F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8852F, 0.7702F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone5
				.addOrReplaceChild("cube_r60",
						CubeListBuilder.create().texOffs(0, 38).addBox(-0.5F, -0.1544F, -0.5423F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition bone6 = da2.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.25F, 16.2638F, -5.7579F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r61 = bone6.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(34, 89).addBox(0.0F, -0.3266F, -1.8647F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3974F, -2.2536F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r62 = bone6
				.addOrReplaceChild("cube_r62",
						CubeListBuilder.create().texOffs(32, 29).addBox(-0.5F, -0.1544F, -0.4577F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone7 = da2.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 16.2638F, -5.7579F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bone7.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(30, 86).addBox(0.0F, -0.7614F, -0.9254F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3852F, -2.661F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone7
				.addOrReplaceChild("cube_r64",
						CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.1544F, -0.4577F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition bone8 = da2.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.25F, 16.2638F, -5.7579F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone8.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(30, 73).addBox(0.0F, -0.393F, -1.1962F, 0.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7765F, -2.8978F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r66 = bone8
				.addOrReplaceChild("cube_r66",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.1544F, -0.4577F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition Right_leg = partdefinition.addOrReplaceChild("Right_leg",
				CubeListBuilder.create().texOffs(28, 34)
						.addBox(-2.0F, 0.0F, -2.75F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 18)
						.addBox(-2.5F, 0.5F, -2.25F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 3.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition dl2 = Right_leg.addOrReplaceChild("dl2",
				CubeListBuilder.create().texOffs(38, 53)
						.addBox(-2.125F, 4.0F, -0.875F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-2.375F, 0.0F, -1.125F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, 8.0F, -1.375F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r67 = dl2.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(16, 32)
						.addBox(0.5F, -4.0154F, -3.8478F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(-1.5F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.375F, -0.2981F, -1.0534F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r68 = dl2.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(34, 84).addBox(0.0F, -6.0F, -3.25F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.625F, 6.1789F, -7.6993F, 0.8172F, -0.1396F, 0.1682F));

		PartDefinition cube_r69 = dl2.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(50, 85).addBox(-2.0F, -6.0F, -3.25F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.625F, 6.1789F, -7.6993F, 0.812F, 0.1671F, -0.2024F));

		PartDefinition cube_r70 = dl2.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(12, 64)
						.addBox(-2.0F, -1.0F, -3.25F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 63)
						.addBox(-1.5F, 0.0F, -3.25F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.625F, 6.1789F, -7.6993F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r71 = dl2.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(0, 69).addBox(-0.5F, -6.8577F, -1.5199F, 2.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.125F, 11.8577F, 0.6449F, 1.4835F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Right_ribcage.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_ribcage.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Right_ribcage.yRot = headPitch / (180F / (float) Math.PI);
		this.Right_Arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Left_ribcage.yRot = headPitch / (180F / (float) Math.PI);
		this.Left_Arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}