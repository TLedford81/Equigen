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

//    public PartTransform subtractPosition(PartTransform parentPosition, PartTransform childPosition) {
//
//        float px = (float) parentPosition.position.x;
//        float py = (float) parentPosition.position.y;
//        float pz = (float) parentPosition.position.z;
//
//        float cx = (float) childPosition.position.x;
//        float cy = (float) childPosition.position.y;
//        float cz = (float) childPosition.position.z;
//
//        float sx = px - cx;
//        float sy = py - cy;
//        float sz = pz - cz;
//
//        EquigenMod.LOGGER.info("SUBTRACTING CHILD FROM PARENT");
//        EquigenMod.LOGGER.info("PARENT = " + parentPosition.getPosition());
//        EquigenMod.LOGGER.info("CHILD = " + childPosition.getPosition());
//        EquigenMod.LOGGER.info("X = " + (px - cx) + " Y = " + (py - cy) + " Z = " + (pz - cz));
//        Vec3 position = new Vec3(sx, sy, sz);
//        return new PartTransform(position, childPosition.rotation, childPosition.scale);
//
//    }

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
