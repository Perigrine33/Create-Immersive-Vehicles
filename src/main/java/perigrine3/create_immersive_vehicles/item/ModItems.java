package perigrine3.create_immersive_vehicles.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import perigrine3.create_immersive_vehicles.CreateImmersiveVehicles;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateImmersiveVehicles.MODID);


    public static final DeferredItem<Item> ANDESITE_BIPLANE = ITEMS.register("andesite_biplane",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_BIPLANE = ITEMS.register("copper_biplane",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_BIPLANE = ITEMS.register("brass_biplane",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BALL_BEARING = ITEMS.register("ball_bearing",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}