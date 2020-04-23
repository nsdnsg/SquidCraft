package io.github.squidcraft.api;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/**
 * @author squid233
 * <p>register blocks api</p>
 */
@Nullable
public class BlocksRegister {
    public static void registerBlock(String modid, String blockName, Block block, Item.Settings settings) {
        Logger logger = LogManager.getLogger("register block and block item");
        Registry.register(Registry.BLOCK, new Identifier(modid, blockName), block);
        logger.info("register " + blockName + " block");
        Registry.register(Registry.ITEM, new Identifier(modid, blockName), new BlockItem(block, settings));
        logger.info("register " + blockName + "block info item");
    }

    public static void registerContainer(Identifier id, Block block, Item.Settings settings) {
        Logger logger = LogManager.getLogger("register container");
        Registry.register(Registry.BLOCK, id, block);
        Registry.register(Registry.ITEM, id, new BlockItem(block, settings));
        logger.info("register container");
    }

}
