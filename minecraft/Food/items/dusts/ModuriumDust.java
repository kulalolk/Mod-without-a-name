package Food.items.dusts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModuriumDust extends Item {

	public ModuriumDust(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ModuriumDust");
		setTextureName("food:ModuriumDust");
		
	}
}
