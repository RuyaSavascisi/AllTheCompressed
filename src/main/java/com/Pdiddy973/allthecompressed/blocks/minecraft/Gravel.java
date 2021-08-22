package com.Pdiddy973.AllTheCompressed.blocks.minecraft;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraftforge.common.ToolType;

public class Gravel extends FallingBlock {
    public Gravel() {
        super(Properties.of(Material.SAND)
                .sound(SoundType.SAND)
                .strength(30f, 15F)
                .harvestTool(ToolType.SHOVEL)
                .requiresCorrectToolForDrops());
    }

    protected void falling(FallingBlockEntity fallingEntity) {
        fallingEntity.setHurtsEntities(true);
    }
}