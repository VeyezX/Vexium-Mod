package veyezx.mod.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import veyezx.mod.init.BlockInit;
import veyezx.mod.objects.blocks.BlockOres;
import veyezx.mod.util.handlers.EnumHandler;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_vexium;
	private WorldGenerator ore_overworld_dimiscus;
	
	public WorldGenCustomOres() 
	{
		ore_overworld_vexium = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.VEXIUM), 3, BlockMatcher.forBlock(Blocks.STONE));
		
		ore_overworld_dimiscus = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.DIMISCUS), 3, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			
			
			break;
			
		case 0:
			
			runGenerator(ore_overworld_vexium, world, random, chunkX, chunkZ, 1, 0, 6);
			runGenerator(ore_overworld_dimiscus, world, random, chunkX, chunkZ, 50, 0, 60);
			
			break;
			
		case 1:
			
			
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
