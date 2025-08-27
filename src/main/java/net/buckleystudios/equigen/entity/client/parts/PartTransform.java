package net.buckleystudios.equigen.entity.client.parts;

import net.minecraft.world.phys.Vec3;

public class PartTransform {
    public static final PartTransform IDENTITY =
            new PartTransform(Vec3.ZERO, Vec3.ZERO, new Vec3(1,1,1));

    public final Vec3 position;
    public final Vec3 rotation; // in degrees
    public final Vec3 scale;

    public PartTransform(Vec3 position, Vec3 rotation, Vec3 scale) {
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }
}
