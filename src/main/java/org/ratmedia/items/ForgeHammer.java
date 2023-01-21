package org.ratmedia.items; // Package name.

import net.minecraft.block.Block;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ForgeHammer extends Item {

    // Constructor for item.
    public ForgeHammer(){
        
        super(new Item.Settings()
        .maxCount(1) // Max stack of item is 1.
        .maxDamage(80)); // Durability is 80.

    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){

        ItemStack itemInHand = player.getStackInHand(hand);
        Block block = world.getBlockState(player.getBlockPos()).getBlock();

        if(block instanceof CraftingTableBlock){

            itemInHand.decrement(1);
            return new TypedActionResult<ItemStack>(ActionResult.PASS, itemInHand);

        }

        return new TypedActionResult<ItemStack>(ActionResult.FAIL, itemInHand);

    }

}
