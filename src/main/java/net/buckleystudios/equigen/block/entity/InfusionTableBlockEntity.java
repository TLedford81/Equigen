package net.buckleystudios.equigen.block.entity;

import net.buckleystudios.equigen.item.ModItems;
import net.buckleystudios.equigen.recipe.InfusionTableRecipe;
import net.buckleystudios.equigen.recipe.ModRecipes;
import net.buckleystudios.equigen.screen.Infusion_Table.InfusionTableMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class InfusionTableBlockEntity extends BlockEntity implements MenuProvider {

    // How Many Slots inside Block Entity Inventory?
    public static int slotCount = 4;
    private int cookTime = 78;


    public final ItemStackHandler itemStackHandler = new ItemStackHandler(slotCount){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            //Case for what is allowed to be inputted into each slot 
            //True = Anything 
            //False = Nothing
            
            return switch (slot){
                case 0 -> true; //Input
                case 1 -> true; //Fuel
                case 2 -> false; //Extra 
                case 3 -> true; //Output
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    //Constants for naming each slot
    //Based on concept art: 7 Slots: Input, Infusion 1, Infusion 2, Infusion 3, Infusion 4, Fuel, Output
    private static final int INPUT_SLOT = 0;
    private static final int FUEL_SLOT = 1;
    private static final int EXTRA_SLOT = 2;
    private static final int OUTPUT_SLOT = 3;

//    private Lazy<IItemHandler> lazyItemHandler = Lazy.of(null);

    private final ContainerData data;
    private int progress = 0;
    private int maxProgress = cookTime;

    public InfusionTableBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.INFUSION_TABLE_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex){
                    case 0 -> InfusionTableBlockEntity.this.progress;
                    case 1 -> InfusionTableBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex){
                    case 0 -> InfusionTableBlockEntity.this.progress = pValue;
                    case 1 -> InfusionTableBlockEntity.this.maxProgress = pValue;
                }

            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Infusion Table");
    }

    public void dropItems() {
        SimpleContainer inventory = new SimpleContainer(itemStackHandler.getSlots());
        for(int i=0; i < itemStackHandler.getSlots(); i++) {
            inventory.setItem(i, itemStackHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new InfusionTableMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public void invalidateCapabilities() {
        super.invalidateCapabilities();
    }

    @Override
    public void onLoad() {
        super.onLoad();
//        lazyItemHandler = Lazy.of(() -> itemStackHandler);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        pTag.put("inventory", itemStackHandler.serializeNBT(pRegistries)); //Save Inventory
        super.saveAdditional(pTag, pRegistries);
    }

    @Override
    protected void loadAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
        itemStackHandler.deserializeNBT(pRegistries, pTag.getCompound("inventory")); //Load Inventory
        super.loadAdditional(pTag, pRegistries);
    }

    //Called Every tick (20x per second)
    public void tick(Level level, BlockPos pPos, BlockState pState) {
        //Ew, Java knowledge
        if(isOutputSlotReceivable() && isValidRecipe()){
            increaseCraftingProcess();
            setChanged(level, pPos, pState);
            
            if(hasProgressFinished()){
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem() {
        this.itemStackHandler.extractItem(INPUT_SLOT, 1, false);
        this.itemStackHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(ModItems.HIMALAYAN_ROCK_SALT.get(), this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).getCount() + 1));
    }

    private boolean hasProgressFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProcess() {
        this.progress++;
    }

    private Optional<InfusionTableRecipe> getCurrentRecipe(){
        SimpleContainer inventory = new SimpleContainer(this.itemStackHandler.getSlots());
        for(int i = 0; i<this.itemStackHandler.getSlots(); i++){
            inventory.setItem(i, this.itemStackHandler.getStackInSlot(i));
        }
//
//        return this.level.getRecipeManager().getRecipeFor(InfusionTableRecipe., inventory, level);
        return this.level.getRecipeManager().getRecipeFor(ModRecipes.INFUSION_TABLE_RECIPE_TYPE, inventory, level);
    }

    private boolean inputHasRecipeItem() {
        return this.itemStackHandler.getStackInSlot(INPUT_SLOT).getItem() == ModItems.SODIUM.get();
    }

    private boolean canOutputItem(Item item) {
        return this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).is(item);
    }

    private boolean canOutputAmount(int count) {
        return this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize() >=
                this.itemStackHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count;
    }

    private boolean isOutputSlotReceivable() {
        ItemStack outputItem = this.itemStackHandler.getStackInSlot(OUTPUT_SLOT);
        return outputItem.isEmpty() ||
                outputItem.getCount() < outputItem.getMaxStackSize();
    }
}
