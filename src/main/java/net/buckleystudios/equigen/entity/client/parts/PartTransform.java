package net.buckleystudios.equigen.entity.client.parts;

import net.buckleystudios.equigen.EquigenMod;
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
        EquigenMod.LOGGER.info("Part Transform = Position: " + position + ",  Rotation: " + rotation + ", Scale: " + scale);
        logCaller();
    }

    public Vec3 getPosition() {
        return position;
    }

    private void logCaller() {
        // [0] is getStackTrace, [1] is this method, [2] is the caller of this method
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 2) {
            String callerClass = stackTrace[4].getClassName();
            String callerMethod = stackTrace[4].getMethodName();
            EquigenMod.LOGGER.info("Called from " + callerClass + "." + callerMethod + "()");
        }
    }
}
