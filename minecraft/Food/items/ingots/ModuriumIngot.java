package Food.items.ingots;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModuriumIngot extends Item {

	public ModuriumIngot(int id) {
		
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ModuriumIngot");
		setTextureName("food:ModuriumIngot");
	}
}
