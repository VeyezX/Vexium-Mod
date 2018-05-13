package veyezx.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import veyezx.mod.objects.items.ItemBase;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Ingots
	public static final Item INGOT_VEXIUM = new ItemBase("ingot_vexium");
	public static final Item INGOT_DIMISCUS = new ItemBase("ingot_dimiscus");
	
	//Dusts
	public static final Item DUST_VEXIUM = new ItemBase("dust_vexium").setMaxStackSize(1);
	public static final Item DUST_DIMISCUS = new ItemBase("dust_dimiscus").setMaxStackSize(1);

}
