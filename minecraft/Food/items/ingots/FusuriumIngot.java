package Food.items.ingots;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FusuriumIngot extends Item {

	public FusuriumIngot(int id) {
		
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("FusuriumIngot");
		setTextureName("food:FusuriumIngot");
	}

}