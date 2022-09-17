package com.codigomorsa.tutorialmod.items;

import com.codigomorsa.tutorialmod.utils.Summon;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ThrowablePotionItem;
import net.minecraft.world.level.Level;


public class Pokeball extends ThrowablePotionItem {
    public Pokeball(Properties props) {
        super(props);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interact) {
        var result = super.use(level, player, interact);
        Summon.summonEntity("tutorialmod:morsa", player);
        return result;
    }
}
