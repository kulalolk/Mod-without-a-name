package Food.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import Food.FoodSource;

public class MagicalOre extends Block {

	public MagicalOre(int id, Material material) {
		super(id, material);
		
		setHardness(4.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("MagicalOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName("food:MagicalOre");
		
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return FoodSource.MagicalDust.itemID;
	}
	
}
