package Food.items.tools.fusurium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class FusuriumPickaxe extends ItemPickaxe{

	public FusuriumPickaxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
	}

	{
		
	setUnlocalizedName("FusuriumPickaxe");
	setCreativeTab(CreativeTabs.tabTools);
	
	}
}