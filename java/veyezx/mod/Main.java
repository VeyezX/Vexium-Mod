package veyezx.mod;

import veyezx.mod.init.ItemInit;
import veyezx.mod.proxy.CommonProxy;
import veyezx.mod.util.Reference;
import veyezx.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.otherRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
	
	
	
	
	
	
	
	//Creative Tab
	public static CreativeTabs tabVexius = new CreativeTabs("tab_vexius") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.INGOT_VEXIUM);
		}
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}.setBackgroundImageName("item_search.png");
	
}
