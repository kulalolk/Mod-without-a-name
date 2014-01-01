package Food.items.dusts;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KuptoniteDust extends Item {

	public KuptoniteDust(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("KuptonDust");
		setTextureName("food:KuptonDust");
	}

}