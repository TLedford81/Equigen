package net.buckleystudios.equigen.entity.custom;

import net.buckleystudios.equigen.entity.ModEntities;
import net.buckleystudios.equigen.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Leashable;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.Nullable;

public class LassoProjectileEntity extends AbstractArrow implements Leashable{

    private LivingEntity Shooter;
    private Leashable.LeashData leashData;

    public LassoProjectileEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    public LassoProjectileEntity(LivingEntity shooter, Level level) {
        super(ModEntities.LASSO.get(), shooter, level, new ItemStack(ModItems.LASSO.get()), null);
        this.Shooter = shooter;
        if (!this.level().isClientSide) {
            this.setLeashedTo(shooter, true);
        }
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.SODIUM_GRENADE.get());
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        setBaseDamage(0.0);
        this.dropLeash(true, false);
        super.onHitEntity(result);
        Entity entity = result.getEntity();

        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte) 3);

            if(entity instanceof Leashable leashable && Shooter instanceof Player player){
                if(player.distanceTo(entity) <= 5){
                    leashable.setLeashedTo(player, true);
                }
            }
        }
    }

    @Override
    public @Nullable LeashData getLeashData() {
        return this.leashData;
    }

    @Override
    public void setLeashData(@Nullable Leashable.LeashData leashData) {
        this.leashData = leashData;
    }
}
