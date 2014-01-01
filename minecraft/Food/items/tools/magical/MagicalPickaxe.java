package Food.items.tools.magical;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class MagicalPickaxe extends ItemPickaxe{

	public MagicalPickaxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
	}

	{
		
	setTextureName("food:MagicalPickaxe");
	setUnlocalizedName("MagicalPickaxe");
	setCreativeTab(CreativeTabs.tabTools);
	
	}
}