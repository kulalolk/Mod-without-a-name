package Food.items.dusts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MagicalDust extends Item {

	public MagicalDust(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("MagicalDust");
		setTextureName("food:MagicalDust");
	}

}
