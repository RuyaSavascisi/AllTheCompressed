package com.Pdiddy973.AllTheCompressed.blocks.atm;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ua_alloy extends Block {
    public ua_alloy() {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(15f, 2000f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .requiresCorrectToolForDrops());
    }
}