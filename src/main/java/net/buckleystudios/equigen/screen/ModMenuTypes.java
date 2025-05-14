package net.buckleystudios.equigen.screen;

import net.buckleystudios.equigen.EquigenMod;
import net.buckleystudios.equigen.screen.Infusion_Table.InfusionTableMenu;
import net.buckleystudios.equigen.screen.Stall_Manager.StallManagerMenu;
import net.buckleystudios.equigen.screen.Test_Entity.TestEntityMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(BuiltInRegistries.MENU, EquigenMod.MODID);

    public static final DeferredHolder<MenuType<?>, MenuType<InfusionTableMenu>> INFUSION_TABLE_MENU =
            registerMenuType(InfusionTableMenu::new, "infusion_table_menu");
    public static final DeferredHolder<MenuType<?>, MenuType<TestEntityMenu>> TEST_ENTITY_MENU =
            registerMenuType(TestEntityMenu::create, "test_entity_menu");
    public static final DeferredHolder<MenuType<?>, MenuType<StallManagerMenu>> STALL_MANAGER_MENU =
            registerMenuType(StallManagerMenu::new, "stall_manager_menu");

    private static <T extends AbstractContainerMenu> DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }
}
