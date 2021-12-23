package com.Pdiddy973.AllTheCompressed.blocks.minecraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Grass extends Block {
    public Grass() {
        super(Properties.of(Material.GRASS)
            .sound(SoundType.GRASS)
            .requiresCorrectToolForDrops()
            .strength(7.0f, 20.0f));
    }
}