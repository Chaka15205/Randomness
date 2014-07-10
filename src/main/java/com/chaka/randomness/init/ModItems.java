package com.chaka.randomness.init;

import com.chaka.randomness.item.ItemR;
import com.chaka.randomness.item.ItemRBase;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemR rBase = new ItemRBase();

    public static void init() {
        GameRegistry.registerItem(rBase, "rbase");
    }
}