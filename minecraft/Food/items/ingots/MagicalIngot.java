package Food.items.ingots;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MagicalIngot extends Item {

	public MagicalIngot(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("MagicalIngot");
		setTextureName("food:MagicalIngot");
	}

}
