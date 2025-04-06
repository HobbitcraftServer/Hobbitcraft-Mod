package derp.hcmod.item;


import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import xyz.nucleoid.packettweaker.PacketContext;

public class SilverHobbitCoin extends Item implements PolymerItem {
    public SilverHobbitCoin(Settings settings) {
        super(settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, PacketContext packetContext) {
        return Items.GOLD_NUGGET;
    }
    @Override
    public Identifier getPolymerItemModel(ItemStack itemStack, PacketContext context) {
        return Identifier.of("hcmod", "item/silver_hobbit_coin");
    }
}
