package net.mcreator.cummod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.cummod.init.CummodModEntities;
import net.mcreator.cummod.entity.SaweridleEntity;

import java.util.Comparator;

public class SawerattackPriObnovlieniiTaktaSushchnostiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		double health = 0;
		double velocityX = 0;
		double pitch = 0;
		double velocityZ = 0;
		double velocityY = 0;
		double oxygen = 0;
		double yaw = 0;
		if (!world.isClientSide()) {
			if (!(!world
					.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 16, 16, 16), e -> true)
					.isEmpty())) {
				yaw = entity.getYRot();
				pitch = entity.getXRot();
				posX = entity.getX();
				posY = entity.getY();
				posZ = entity.getZ();
				velocityX = entity.getDeltaMovement().x();
				velocityY = entity.getDeltaMovement().y();
				velocityZ = entity.getDeltaMovement().z();
				health = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
				oxygen = entity.getAirSupply();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new SaweridleEntity(CummodModEntities.SAWERIDLE.get(), _level);
					entityToSpawn.moveTo(posX, posY, posZ, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!world.getEntitiesOfClass(SaweridleEntity.class, AABB.ofSize(new Vec3(posX, posY, posZ), 16, 16, 16), e -> true).isEmpty()) {
					{
						Entity _ent = ((Entity) world
								.getEntitiesOfClass(SaweridleEntity.class, AABB.ofSize(new Vec3(posX, posY, posZ), 16, 16, 16), e -> true).stream()
								.sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(posX, posY, posZ)).findFirst().orElse(null));
						_ent.setYRot((float) yaw);
						_ent.setXRot((float) pitch);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					((Entity) world.getEntitiesOfClass(SaweridleEntity.class, AABB.ofSize(new Vec3(posX, posY, posZ), 16, 16, 16), e -> true).stream()
							.sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(posX, posY, posZ)).findFirst().orElse(null)).setDeltaMovement(new Vec3(velocityX, velocityY, velocityZ));
					if (((Entity) world.getEntitiesOfClass(SaweridleEntity.class, AABB.ofSize(new Vec3(posX, posY, posZ), 16, 16, 16), e -> true)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(posX, posY, posZ)).findFirst().orElse(null)) instanceof LivingEntity _entity)
						_entity.setHealth((float) health);
					((Entity) world.getEntitiesOfClass(SaweridleEntity.class, AABB.ofSize(new Vec3(posX, posY, posZ), 16, 16, 16), e -> true).stream()
							.sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(posX, posY, posZ)).findFirst().orElse(null)).setAirSupply((int) oxygen);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
