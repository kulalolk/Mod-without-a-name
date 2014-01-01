package Food.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import Food.FoodSource;

public class FusuriumOre extends Block {

	public FusuriumOre(int id, Material material) {
		super(id, material);
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("FusuriumOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("food:FusuriumOre");
		
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return FoodSource.FusuriumDust.itemID;
	}
	
}