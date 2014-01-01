package Food;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import Food.blocks.ores.FusuriumOre;
import Food.blocks.ores.KuptoniteOre;
import Food.blocks.ores.MagicalOre;
import Food.blocks.ores.ModuriumOre;
import Food.blocks.ores.NetheriteOre;
import Food.items.armour.kuptonite.KuptoniteBoots;
import Food.items.armour.kuptonite.KuptoniteChest;
import Food.items.armour.kuptonite.KuptoniteHelm;
import Food.items.armour.kuptonite.KuptoniteLegs;
import Food.items.armour.magical.MagicalBoots;
import Food.items.armour.magical.MagicalChest;
import Food.items.armour.magical.MagicalHelm;
import Food.items.armour.magical.MagicalLegs;
import Food.items.dusts.FusuriumDust;
import Food.items.dusts.GilsansiumDust;
import Food.items.dusts.KuptoniteDust;
import Food.items.dusts.MagicalDust;
import Food.items.dusts.ModuriumDust;
import Food.items.dusts.NetheriteDust;
import Food.items.ingots.FusuriumIngot;
import Food.items.ingots.GilsansiumIngot;
import Food.items.ingots.KuptoniteIngot;
import Food.items.ingots.MagicalIngot;
import Food.items.ingots.ModuriumIngot;
import Food.items.ingots.NetheriteIngot;
import Food.items.tools.fusurium.FusuriumPickaxe;
import Food.items.tools.fusurium.FusuriumSword;
import Food.items.tools.gilsansium.GilsansiumPickaxe;
import Food.items.tools.gilsansium.GilsansiumSword;
import Food.items.tools.kuptonite.KuptoniteAxe;
import Food.items.tools.kuptonite.KuptoniteHoe;
import Food.items.tools.kuptonite.KuptonitePickaxe;
import Food.items.tools.kuptonite.KuptoniteShovel;
import Food.items.tools.kuptonite.KuptoniteSword;
import Food.items.tools.magical.MagicalAxe;
import Food.items.tools.magical.MagicalHoe;
import Food.items.tools.magical.MagicalPickaxe;
import Food.items.tools.magical.MagicalShovel;
import Food.items.tools.magical.MagicalSword;
import Food.items.tools.modurium.ModuriumPickaxe;
import Food.items.tools.modurium.ModuriumSword;
import Food.items.tools.netherite.NetheriteSword;
import Food.worldgen.EventManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid="Food", name="Food", version="Alpha 0.0.1-A")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class FoodSource {
	
	EventManager eventmanager = new EventManager();
	
	//TOOL MATERIALS
	
	public static EnumToolMaterial Magical = EnumHelper.addToolMaterial("Magical", 4, 2500, 12.0F, 8.0F, 22);
	public static EnumToolMaterial Kupton = EnumHelper.addToolMaterial("Kupton", 5, 2500, 12.0F, 12.0F, 22);
	public static EnumToolMaterial Modurium = EnumHelper.addToolMaterial("Modurium", 6, 2500, 12.0F, 18.0F, 22);
	public static EnumToolMaterial Fusurium = EnumHelper.addToolMaterial("Fusurium", 7, 2500, 12.0F, 27.0F, 22);
	public static EnumToolMaterial Gilsansium = EnumHelper.addToolMaterial("Gilsansium", 8, 2500, 12.0F, 60.0F, 22);
	public static EnumToolMaterial Netherite = EnumHelper.addToolMaterial("Netherite", 9, 2500, 12.0F, 90.0F, 22);
	
	public static EnumArmorMaterial MagicalArmour = EnumHelper.addArmorMaterial("Magical", 50, new int []{6, 16, 12, 6}, 20);
	public static EnumArmorMaterial KuptonArmour = EnumHelper.addArmorMaterial("Kupton", 100, new int []{12, 32, 24, 12}, 40);
	public static EnumArmorMaterial ModuriumArmour = EnumHelper.addArmorMaterial("Modurium", 200, new int []{24, 64, 48, 24}, 80);
	public static EnumArmorMaterial FusuriumArmour = EnumHelper.addArmorMaterial("Fusurium", 400, new int []{48, 128, 96, 48}, 160);
	public static EnumArmorMaterial GilsansiumArmour = EnumHelper.addArmorMaterial("Gilsansium", 800, new int []{96, 256, 192, 96}, 320);
	public static EnumArmorMaterial NetheriteArmour = EnumHelper.addArmorMaterial("Netherite", 800, new int []{184, 512, 384, 192}, 640);
		



		// The instance of your mod that Forge uses.
        @Instance("Food")
        public static FoodSource instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="Food.client.ClientProxy", serverSide="Food.CommonProxy")
        public static CommonProxy proxy;
        
        //CREATIVE TABS
        public static CreativeTabs tabGilsansium = new CreativeTabs("Gilsansim") {
        	public ItemStack getIconItemStack() {
        		return new ItemStack(MagicalDust);
        	}
        }
; 
        
        //BLOCKS (ORES)
        
        public final static Block MagicalOre = new MagicalOre(1000, Material.rock);
        public final static Block KuptonOre = new KuptoniteOre(1001, Material.rock);
        public final static Block ModuriumOre = new ModuriumOre(1002, Material.rock);
        public final static Block FusuriumOre = new FusuriumOre(1003, Material.rock);
        public final static Block NetheriteOre = new NetheriteOre(1004, Material.rock);
        
        //ITEMS (MAGICAL)
        
        public final static Item MagicalDust = new MagicalDust(9000);        
        public final static Item MagicalIngot = new MagicalIngot(9001);
        public final static Item MagicalSword = new MagicalSword(9002, Magical);
        public final static Item MagicalPickaxe = new MagicalPickaxe(9003, Magical);
        public final static Item MagicalShovel = new MagicalShovel(9004, Magical);
        public final static Item MagicalAxe = new MagicalAxe(9005, Magical);
        public final static Item MagicalHoe = new MagicalHoe(9006, Magical);
        public final static Item MagicalHelm = new MagicalHelm(9007, MagicalArmour);
        public final static Item MagicalChest = new MagicalChest(9008, MagicalArmour);
        public final static Item MagicalLegs = new MagicalLegs(9009, MagicalArmour);
        public final static Item MagicalBoots = new MagicalBoots(9010, MagicalArmour);
        
        //ITEMS (KUPTONITE)
        
        public final static Item KuptonDust = new KuptoniteDust(9025);        
        public final static Item KuptonIngot = new KuptoniteIngot(9026);
        public final static Item KuptonSword = new KuptoniteSword(9027, Kupton);
        public final static Item KuptonPickaxe = new KuptonitePickaxe(9028, Kupton);
        public final static Item KuptonShovel = new KuptoniteShovel(9029, Kupton);
        public final static Item KuptonAxe = new KuptoniteAxe(9030, Kupton);
        public final static Item KuptonHoe = new KuptoniteHoe(9031, Kupton);
        public final static Item KuptonHelm = new KuptoniteHelm(9032, KuptonArmour);
        public final static Item KuptonChest = new KuptoniteChest(9033, KuptonArmour);
        public final static Item KuptonLegs = new KuptoniteLegs(9034, KuptonArmour);
        public final static Item KuptonBoots = new KuptoniteBoots(9035, KuptonArmour);
        
        //ITEMS (MODURIUM)
        
        public final static Item ModuriumDust = new ModuriumDust(9050);        
        public final static Item ModuriumIngot = new ModuriumIngot(9051);
        public final static Item ModuriumSword = new ModuriumSword(9052, Modurium);
        public final static Item ModuriumPickaxe = new ModuriumPickaxe(9053, Modurium);
        
        //ITEMS (FUSURIUM)
        
        public final static Item FusuriumDust = new FusuriumDust(9075);
        public final static Item FusuriumIngot = new FusuriumIngot(9076);
        public final static Item FusuriumSword = new FusuriumSword(9077, Fusurium);
        public final static Item FusuriumPickaxe = new FusuriumPickaxe(9078, Fusurium);

        
        //ITEMS (GILSANSIUM)
        
        public final static Item GilsansiumDust = new GilsansiumDust(9100);      
        public final static Item GilsansiumIngot = new GilsansiumIngot(9101);
        public final static Item GilsansiumSword = new GilsansiumSword(9102, Gilsansium);
        public final static Item GilsansiumPickaxe = new GilsansiumPickaxe(9103, Gilsansium);
        
        //ITEMS (NETHERITE)
        
        public final static Item NetheriteDust = new NetheriteDust(9125);
        public final static Item NetheriteIngot = new NetheriteIngot(9126);
        public final static Item NetheriteSword = new NetheriteSword(9127, Netherite);

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();    
                
                //BLOCKS (ORES)
                
                GameRegistry.registerBlock(MagicalOre, "MagicalOre");
                LanguageRegistry.addName(MagicalOre, "Magical Ore");
                MinecraftForge.setBlockHarvestLevel(MagicalOre, "pickaxe", 3);
                
                GameRegistry.registerBlock(KuptonOre, "KuptonOre");
                LanguageRegistry.addName(KuptonOre, "Kuptonite Ore");
                MinecraftForge.setBlockHarvestLevel(KuptonOre, "pickaxe", 4);
                
                GameRegistry.registerBlock(ModuriumOre, "ModuriumOre");
                LanguageRegistry.addName(ModuriumOre, "Modurium Ore");
                MinecraftForge.setBlockHarvestLevel(ModuriumOre, "pickaxe", 5);
                
                GameRegistry.registerBlock(FusuriumOre, "FusuriumOre");
                LanguageRegistry.addName(FusuriumOre, "Fusurium Ore");
                MinecraftForge.setBlockHarvestLevel(FusuriumOre, "pickaxe", 6);
                
                GameRegistry.registerBlock(NetheriteOre, "NetheriteOre");
                LanguageRegistry.addName(NetheriteOre, "Netherite Ore");
                MinecraftForge.setBlockHarvestLevel(NetheriteOre, "pickaxe", 8);
                
                //REGISTER ITEMS (MAGICAL
                
                GameRegistry.registerItem(MagicalDust, "MagicalDust");
                LanguageRegistry.addName(MagicalDust, "Magical Dust");             
                GameRegistry.registerItem(MagicalIngot, "MagicalIngot");
                LanguageRegistry.addName(MagicalIngot, "Magical Ingot");
                GameRegistry.registerItem(MagicalSword, "MagicalSword");
                LanguageRegistry.addName(MagicalSword, "Magical Sword");
                GameRegistry.registerItem(MagicalPickaxe, "MagicalPickaxe");
                LanguageRegistry.addName(MagicalPickaxe, "Magical Pickaxe");
                GameRegistry.registerItem(MagicalShovel, "MagicalShovel");
                LanguageRegistry.addName(MagicalShovel, "Magical Shovel");
                GameRegistry.registerItem(MagicalAxe, "MagicalAxe");
                LanguageRegistry.addName(MagicalAxe, "Magical Axe");
                GameRegistry.registerItem(MagicalHoe, "MagicalHoe");
                LanguageRegistry.addName(MagicalHoe, "Magical Hoe");
                GameRegistry.registerItem(MagicalHelm, "MagicalHelm");
                LanguageRegistry.addName(MagicalHelm, "Magical Helmet");
                GameRegistry.registerItem(MagicalChest, "MagicalChest");
                LanguageRegistry.addName(MagicalChest, "Magical Chestplate");
                GameRegistry.registerItem(MagicalLegs, "MagicalLegs");
                LanguageRegistry.addName(MagicalLegs, "Magical Platelegs");
                GameRegistry.registerItem(MagicalBoots, "MagicalBoots");
                LanguageRegistry.addName(MagicalBoots, "Magical Boots");
                
                //REGISTER ITEMS (KUPTONITE)
                
                GameRegistry.registerItem(KuptonDust, "KuptonDust");
                LanguageRegistry.addName(KuptonDust, "Kuptonite Dust");             
                GameRegistry.registerItem(KuptonIngot, "KuptonIngot");
                LanguageRegistry.addName(KuptonIngot, "Kuptonite Ingot");
                GameRegistry.registerItem(KuptonSword, "KuptonSword");
                LanguageRegistry.addName(KuptonSword, "Kuptonite Sword");
                GameRegistry.registerItem(KuptonPickaxe, "KuptonPickaxe");
                LanguageRegistry.addName(KuptonPickaxe, "Kuptonite Pickaxe");
                GameRegistry.registerItem(KuptonShovel, "KuptonShovel");
                LanguageRegistry.addName(KuptonShovel, "Kuptonite Shovel");
                GameRegistry.registerItem(KuptonAxe, "KuptonAxe");
                LanguageRegistry.addName(KuptonAxe, "Kuptonite Axe");
                GameRegistry.registerItem(KuptonHoe, "KuptonHoe");
                LanguageRegistry.addName(KuptonHoe, "Kuptonite Hoe");
                GameRegistry.registerItem(KuptonHelm, "KuptonHelm");
                LanguageRegistry.addName(KuptonHelm, "Kuptonite Helmet");
                GameRegistry.registerItem(KuptonChest, "KuptonChest");
                LanguageRegistry.addName(KuptonChest, "Kuptonite Chestplate");
                GameRegistry.registerItem(KuptonLegs, "KuptonLegs");
                LanguageRegistry.addName(KuptonLegs, "Kuptonite Platelegs");
                GameRegistry.registerItem(KuptonBoots, "KuptonBoots");
                LanguageRegistry.addName(KuptonBoots, "Kuptonite Boots");
                
                //REGISTER ITEMS (MODURIUM)
                
                GameRegistry.registerItem(ModuriumDust, "ModuriumDust");
                LanguageRegistry.addName(ModuriumDust, "Modurium Dust");                
                GameRegistry.registerItem(ModuriumIngot, "ModuriumIngot");
                LanguageRegistry.addName(ModuriumIngot, "Modurium Ingot");
                GameRegistry.registerItem(ModuriumSword, "ModuriumSword");
                LanguageRegistry.addName(ModuriumSword, "Modurium Sword");
                GameRegistry.registerItem(ModuriumPickaxe, "ModuriumPickaxe");
                LanguageRegistry.addName(ModuriumPickaxe, "Modurium Pickaxe");
                
                //REGISTER ITEMS (FUSURIUM)
                
                GameRegistry.registerItem(FusuriumDust, "FusuriumDust");
                LanguageRegistry.addName(FusuriumDust, "Fusurium Dust");                
                GameRegistry.registerItem(FusuriumIngot, "FusuriumIngot");
                LanguageRegistry.addName(FusuriumIngot, "Fusurium Ingot ");
                GameRegistry.registerItem(FusuriumSword, "FusuriumSword");
                LanguageRegistry.addName(FusuriumSword, "Fusurium Sword");
                GameRegistry.registerItem(FusuriumPickaxe, "FusuriumPickaxe");
                LanguageRegistry.addName(FusuriumPickaxe, "Fusurium Pickaxe");
                
                //REGISTER ITEMS (GILSANSIUM)
                
                GameRegistry.registerItem(GilsansiumDust, "GilsansiumDust");
                LanguageRegistry.addName(GilsansiumDust, "Gilsansium Dust");                
                GameRegistry.registerItem(GilsansiumIngot, "GilsansiumIngot");
                LanguageRegistry.addName(GilsansiumIngot, "Gilsansium Ingot)");
                GameRegistry.registerItem(GilsansiumSword, "GilsansiumSword");
                LanguageRegistry.addName(GilsansiumSword, "Gilsansium Sword");
                GameRegistry.registerItem(GilsansiumPickaxe, "GilsansiumPickaxe");
                LanguageRegistry.addName(GilsansiumPickaxe, "Gilsansium Pickaxe");
                
                //WORLD GEN
                
                GameRegistry.registerWorldGenerator(eventmanager);
                
                //RECIPES
                
                		//ITEM STACKS
                
                ItemStack StickStack = new ItemStack(Item.stick);
                ItemStack MagicalPickaxeStack = new ItemStack(FoodSource.MagicalPickaxe);
                ItemStack KuptonPickaxeStack = new ItemStack(FoodSource.KuptonPickaxe);
                ItemStack ModuriumPickaxeStack = new ItemStack(FoodSource.ModuriumPickaxe);
                ItemStack FusuriumPickaxeStack = new ItemStack(FoodSource.FusuriumPickaxe);
                ItemStack GilsansiumPickaxeStack = new ItemStack(FoodSource.GilsansiumPickaxe);
                ItemStack MagicalDustStack = new ItemStack(FoodSource.MagicalDust, 1);
                ItemStack MagicalIngotStack = new ItemStack(FoodSource.MagicalIngot, 2);
                ItemStack KuptonDustStack = new ItemStack(FoodSource.KuptonDust, 1);
                ItemStack KuptonIngotStack = new ItemStack(FoodSource.KuptonIngot, 2);
                ItemStack ModuriumDustStack = new ItemStack(FoodSource.ModuriumDust, 1);
                ItemStack ModuriumIngotStack = new ItemStack(FoodSource.ModuriumIngot, 2);
                ItemStack FusuriumDustStack = new ItemStack(FoodSource.FusuriumDust, 1);
                ItemStack FusuriumIngotStack = new ItemStack(FoodSource.FusuriumIngot, 2);
                ItemStack GilsansiumDustStack = new ItemStack(FoodSource.GilsansiumDust, 1);
                ItemStack GilsansiumIngotStack = new ItemStack(FoodSource.GilsansiumIngot, 2);
                
                		//SHAPELESS RECIPIES
                
                GameRegistry.addShapelessRecipe(new ItemStack(FoodSource.GilsansiumDust, 2),
                		GilsansiumDustStack, FusuriumDustStack);
                
                		//SHAPED RECIPIES
                
                GameRegistry.addRecipe(new ItemStack(FoodSource.MagicalPickaxe), "xxx", " y ", " y ",
                        'x', MagicalIngotStack, 'y', StickStack);
                GameRegistry.addRecipe(new ItemStack(FoodSource.KuptonPickaxe), "xxx", " y ", " y ",
                        'x', KuptonIngotStack, 'y', StickStack);
                GameRegistry.addRecipe(new ItemStack(FoodSource.ModuriumPickaxe), "xxx", " y ", " y ",
                        'x', ModuriumIngotStack, 'y', StickStack);
                GameRegistry.addRecipe(new ItemStack(FoodSource.FusuriumPickaxe), "xxx", " y ", " y ",
                        'x', FusuriumIngotStack, 'y', StickStack);
                GameRegistry.addRecipe(new ItemStack(FoodSource.GilsansiumPickaxe), "xxx", " y ", " y ",
                        'x', GilsansiumIngotStack, 'y', StickStack);
                
                		//SMELTING RECIPIES
                
                GameRegistry.addSmelting(FoodSource.MagicalDust.itemID, MagicalIngotStack, 0.4F);
                GameRegistry.addSmelting(FoodSource.KuptonDust.itemID, KuptonIngotStack, 0.4F);
                GameRegistry.addSmelting(FoodSource.ModuriumDust.itemID, ModuriumIngotStack, 0.4F);
                GameRegistry.addSmelting(FoodSource.FusuriumDust.itemID, FusuriumIngotStack, 0.4F);
                GameRegistry.addSmelting(FoodSource.GilsansiumDust.itemID, GilsansiumIngotStack, 0.4F);    
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}