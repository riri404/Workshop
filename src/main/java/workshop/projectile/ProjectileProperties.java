package workshop.projectile;


import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class ProjectileProperties extends AbstractArrow {


    public ProjectileProperties(EntityType<? extends AbstractArrow> entity, Level world) {
        super(entity, world);
    }

    public ProjectileProperties(EntityType<? extends AbstractArrow> entity, double x, double y, double z, Level world) {
        super(entity,x,y,z,world);
    }

    public ProjectileProperties(EntityType<? extends AbstractArrow> entity, LivingEntity characters, Level world) {
        super(entity, characters, world);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    protected void hitEntity(EntityHitResult hit){
        super.onHitEntity(hit);
    }
}
