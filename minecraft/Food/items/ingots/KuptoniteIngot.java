package Food.items.ingots;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KuptoniteIngot extends Item {

	public KuptoniteIngot(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("KuptonIngot");
		setTextureName("food:KuptonIngot");
	}

}
