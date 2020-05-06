package io.github.squidcraft.util.registers;

import io.github.squidcraft.SquidCraft;
import io.github.squidcraft.fluid.MilkFluid;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.BaseFluid;

public class FluidRegister {
    public static BaseFluid STILL_MILK = new MilkFluid.Still();
    public static BaseFluid FLOWING_MILK = new MilkFluid.Flowing();
    public static Block MILK = new FluidBlock(STILL_MILK, FabricBlockSettings.copy(Blocks.WATER)){};

    public FluidRegister() {
        registerFluid("milk", STILL_MILK, FLOWING_MILK, MILK);
    }

    public void registerFluid(String fluidID, BaseFluid stillFluid, BaseFluid flowingFluid, Block fluidBlock) {
        io.github.squidcraft.api.FluidRegister.registerFluid(SquidCraft.MODID, fluidID, stillFluid, flowingFluid, fluidBlock);
    }
}
