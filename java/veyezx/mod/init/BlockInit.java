package veyezx.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import veyezx.mod.objects.blocks.BlockBase;
import veyezx.mod.objects.blocks.BlockOres;


public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_VEXIUM = new BlockBase("block_vexium", Material.IRON).setHardness(2.5f);
	public static final Block BLOCK_DIMISCUS = new BlockBase("block_dimiscus", Material.IRON).setHardness(2.5f);



	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	

	

	


}
