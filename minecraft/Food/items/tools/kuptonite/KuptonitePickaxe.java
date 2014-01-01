package Food.items.tools.kuptonite;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class KuptonitePickaxe extends ItemPickaxe{

	public KuptonitePickaxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);

	setTextureName("food:KuptonPickaxe");
	setUnlocalizedName("KuptonPickaxe");
	setCreativeTab(CreativeTabs.tabTools);
	
	}

}
