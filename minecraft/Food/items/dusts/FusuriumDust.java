package Food.items.dusts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FusuriumDust extends Item {

	public FusuriumDust(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("FusuriumDust");
		setTextureName("food:FusuriumDust");
		
	}
}
