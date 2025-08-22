package net.buckleystudios.equigen.entity.custom.behaviour;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.behavior.AnimalMakeLove;
import net.minecraft.world.entity.animal.Animal;

public class GeneticHorseMakeLove extends AnimalMakeLove {
    public GeneticHorseMakeLove(EntityType<? extends Animal> partnerType) {
        super(partnerType);
    }

}
