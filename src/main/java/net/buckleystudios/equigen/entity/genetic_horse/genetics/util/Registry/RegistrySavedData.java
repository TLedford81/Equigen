package net.buckleystudios.equigen.entity.genetic_horse.genetics.util.Registry;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.entity.genetic_horse.genetics.GeneticBreeds;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.*;

public class RegistrySavedData extends SavedData {

    private final Set<RegistryData> registeredHorses = new HashSet<>();

    public static RegistrySavedData create(){
        return new RegistrySavedData();
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider registries) {
        ListTag names = new ListTag();

        for (RegistryData data : registeredHorses) {
            String name = data.name();
            //NAME
            names.add(StringTag.valueOf(name));
            //UUID
            tag.putUUID(name + "_UUID", data.uuid());
            //BREED PERCENTAGES
            Map<GeneticBreeds, Float> map = data.breedPercentages();
            for(GeneticBreeds breed : data.breedPercentages().keySet()){
                tag.putFloat(name + "_BREED_" + breed.toString(), map.get(breed));
            }
            //MOTHER
            tag.putString(name + "_MOTHER", data.mother());
            //FATHER
            tag.putString(name + "_FATHER", data.father());
        }
        tag.put("RegisteredNames", names);
        return tag;
    }

    public static RegistrySavedData load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
        RegistrySavedData data = new RegistrySavedData();

        ListTag list = tag.getList("RegisteredNames", Tag.TAG_STRING);

        for (Tag entry : list) {
            UUID uuid;
            String mother, father;
            Map<GeneticBreeds, Float> breedPercentages = new HashMap<>();

            //NAME
            String name = entry.getAsString();
            //UUID
            if(tag.hasUUID(name + "_UUID")) {
                uuid = tag.getUUID(name + "_UUID");
            } else {
                EquigenMod.LOGGER.error("Could not load registry entry for {}, Missing UUID!", name);
                break;
            }
            //BREED PERCENTAGES
            for(GeneticBreeds breed : GeneticBreeds.values()){
                String query = name + "_BREED_" + breed.toString();
                if(tag.contains(query)){
                    breedPercentages.put(breed, tag.getFloat(query));
                }
            }

            //MOTHER
            mother = tag.contains(name + "_MOTHER") ? tag.getString(name + "_MOTHER") : "";

            //FATHER
            father = tag.contains(name + "_FATHER") ? tag.getString(name + "_FATHER") : "";

            //Generate Registry Data
            data.registeredHorses.add(new RegistryData(name, uuid, breedPercentages, mother, father));
        }
        return data;
    }

    public static RegistrySavedData get(MinecraftServer server) {
        return server.overworld()
                .getDataStorage()
                .computeIfAbsent(
                        new SavedData.Factory<>(
                                RegistrySavedData::create,
                                RegistrySavedData::load
                        ),
                        "equigen_horse_registry"
                );
    }

    public boolean RegisterHorse(String name, UUID uuid, Map<GeneticBreeds, Float> breedPercentages,
                                 String mother, String father){
        for(RegistryData data : registeredHorses){
            if(data.name().equalsIgnoreCase(name)){
                return false;
            }
        }

        registeredHorses.add(new RegistryData(name, uuid, breedPercentages, mother, father));
        this.setDirty();
        return true;
    }

    public boolean UnregisterHorse(String name){

        for(RegistryData data : registeredHorses){
            if(data.name().equalsIgnoreCase(name)){
                registeredHorses.remove(data);
                this.setDirty();
                return true;
            }
        }
        return false;
    }

    public Set<String> getRegisteredHorses(){
        Set<String> names = new HashSet<>();
        for(RegistryData data : registeredHorses){
            names.add(data.name());
        }
        return names;
    }

    public RegistryData getRegistryData(String name){
        for(RegistryData data : registeredHorses){
            if(data.name().equalsIgnoreCase(name)){
                return data;
            }
        }
        return null;
    }

    public boolean contains(String name){
        for(RegistryData data : registeredHorses){
            if(data.name().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
