package atm.bloodworkxgaming.aarandomlensblocker;

import de.ellpeck.actuallyadditions.mod.blocks.InitBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEventHandler {

    @SubscribeEvent
    public void onPlayerInteractEvent(PlayerInteractEvent.RightClickBlock event){
        ItemStack item = event.getItemStack();
        if (item != null && item.getItem() == Items.RECORD_11){
            IBlockState blockState = event.getWorld().getBlockState(event.getPos());
            if (blockState.getBlock() == InitBlocks.blockAtomicReconstructor){
                event.setCanceled(true);
            }
        }
    }
}
