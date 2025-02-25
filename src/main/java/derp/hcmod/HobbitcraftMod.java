package derp.hcmod;

import derp.hcmod.item.GoldHobbitCoin;

import derp.hcmod.item.ModItems;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils.addModAssets;

public class HobbitcraftMod implements ModInitializer {
	public static final String MOD_ID = "hcmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		LOGGER.info("Hobbitcraft Mod Loaded");
		PolymerResourcePackUtils.addModAssets(MOD_ID);
	}
}
