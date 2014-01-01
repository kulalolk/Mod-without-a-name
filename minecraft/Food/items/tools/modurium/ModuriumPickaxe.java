package Food.items.tools.modurium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ModuriumPickaxe extends ItemPickaxe{

	public ModuriumPickaxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
	}
	
	{
	
		setTextureName("food:ModuriumPickaxe");
		setUnlocalizedName("ModuriumPickaxe");
		setCreativeTab(CreativeTabs.tabTools);
		
	}

}
