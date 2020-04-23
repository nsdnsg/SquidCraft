package io.github.squidcraft.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class NetheriteBlock extends Block {
    public NetheriteBlock() {
        super(FabricBlockSettings.of(Material.METAL).strength(50, 1200).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 4).build());
    }
}
