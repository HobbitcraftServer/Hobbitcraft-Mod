package derp.hcmod.item;


import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import xyz.nucleoid.packettweaker.PacketContext;

public class GoldHobbitCoin extends Item implements PolymerItem {
    public GoldHobbitCoin(Settings settings) {
        super(settings);
    }

    @Override
    public Item getPolymerItem(ItemStack itemStack, PacketContext packetContext) {
        return Items.GOLD_NUGGET;
    }

    @Override
    public Identifier getPolymerItemModel(ItemStack itemStack, PacketContext context) {
        return Identifier.of("hcmod", "item/gold_hobbit_coin");
    }

}
