package Food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler {

    // Client stuff
    public void registerRenderers() {
            // Nothing here as the server doesn't render graphics or entities!
    }
    
    
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
    return null;
    }
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
    TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

    	if(tileEntity != null)
    	{
    		switch(ID)
    		{
    			case 0: /* your Containers go here*/
    		}
    	}
	return tileEntity;
    }
}