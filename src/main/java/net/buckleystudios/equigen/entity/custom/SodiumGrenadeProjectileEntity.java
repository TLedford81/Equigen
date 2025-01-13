package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class SodiumGrenadeProjectileEntity extends AbstractArrow {
    private float rotation;

    public SodiumGrenadeProjectileEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    public SodiumGrenadeProjectileEntity(LivingEntity shooter, Level level) {
        super(ModEntities.SODIUM_GRENADE.get(), shooter, level, new ItemStack(ModItems.SODIUM_GRENADE.get()), null);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.SODIUM_GRENADE.get());
    }

    public float getRenderingRotation(){
        rotation += 0.5f;
        if(rotation >= 360){
            rotation = 0;
        }
        return rotation;
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        Entity entity = result.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), 4);

        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte)3);
            this.explode();
        }
    }

    private void explode() {
        if (!this.level().isClientSide) {
            Vec3 position = this.position();
            this.level().explode(this, position.x, position.y, position.z, 3.0F, true, Level.ExplosionInteraction.TNT);
            this.discard(); // Remove the projectile after it explodes
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult result) {
        super.onHitBlock(result);
        this.explode();
    }
}
