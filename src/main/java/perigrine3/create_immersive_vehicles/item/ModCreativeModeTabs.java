package perigrine3.create_immersive_vehicles.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import perigrine3.create_immersive_vehicles.CreateImmersiveVehicles;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateImmersiveVehicles.MODID);

    public static final Supplier<CreativeModeTab> CREATE_IMMERSIVE_VEHICLES_TAB = CREATIVE_MODE_TAB.register("create_immersive_vehicles_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.BRASS_BIPLANE.get()))
                    .title(Component.translatable("creativetab.create_immersive_vehicles.create_immersive_vehicles_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANDESITE_BIPLANE);
                        output.accept(ModItems.COPPER_BIPLANE);
                        output.accept(ModItems.BRASS_BIPLANE);
                        output.accept(ModItems.BALL_BEARING);
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
