package enhancedportals.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.nbt.NBTTagCompound;
import uk.co.shadeddimensions.ep3.tileentity.portal.TileTransferFluid;
import enhancedportals.client.gui.BaseGui;
import enhancedportals.client.gui.GuiTransferFluid;

public class ContainerTransferFluid extends BaseContainer
{
    TileTransferFluid fluid;
    
    public ContainerTransferFluid(TileTransferFluid f, InventoryPlayer p)
    {
        super(null, p, GuiTransferFluid.CONTAINER_SIZE + BaseGui.bufferSpace + BaseGui.playerInventorySize);
        fluid = f;
    }

    @Override
    public void handleGuiPacket(NBTTagCompound tag, EntityPlayer player)
    {

    }
}