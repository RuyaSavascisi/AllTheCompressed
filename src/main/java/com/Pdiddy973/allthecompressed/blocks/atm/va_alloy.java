package com.Pdiddy973.allthecompressed.blocks.atm;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class va_alloy extends Block {
    public va_alloy() {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(15f, 30F)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops());
    }
}