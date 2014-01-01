package Food.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import Food.FoodSource;

public class ModuriumOre extends Block {

	public ModuriumOre(int id, Material material) {
		super(id, material);
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("ModuriumOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("food:ModuriumOre");
		
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return FoodSource.ModuriumDust.itemID;
	}
	
}
