package derp.hcmod.item;

import derp.hcmod.HobbitcraftMod;
import eu.pb4.polymer.core.api.item.PolymerItemUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import xyz.nucleoid.packettweaker.PacketContext;

import java.util.function.Function;

public class ModItems {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HobbitcraftMod.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static final Item GOLD_HOBBIT_COIN = register("gold_hobbit_coin", GoldHobbitCoin::new, new Item.Settings());

    public static final Item SILVER_HOBBIT_COIN = register("silver_hobbit_coin", SilverHobbitCoin::new, new Item.Settings());
    public static final Item COPPER_HOBBIT_COIN = register("copper_hobbit_coin", CopperHobbitCoin::new, new Item.Settings());

    public static void initialize() {
    }

}
