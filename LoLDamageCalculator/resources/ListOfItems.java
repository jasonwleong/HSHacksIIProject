
public class ListOfItems {
	
	//String name, double hp, double ad, double as, double armor, double mr, double apen, double apenPercent)
	//attack damage + warrior + passive giving ad items (set as base ad
	//												name     , hp, ad , as,def, mr,pen,pp 
	
	//ad items
	public static final Item BF_SWORD = new Item("B.F. Sword", 0 , 50 , 0 , 0 , 0 , 0 , 0);
	public static final Item BILGEWATER_CUTLASS = new Item("Bilgewater Cutlass", 0 , 25, 0, 0, 0, 0, 0);
	public static final Item BLADE_OF_THE_RUINED_KING = new Item("Blade of the Ruined King", 0, 25, .4, 0, 0, 0, 0);
	public static final Item DORANS_BLADE = new Item("Doran's Blade", 70, 7, 0, 0, 0, 0, 0);
	public static final Item ESSENCE_REAVER = new Item("Essence Reaver", 0, 80, 0, 0, 0, 0, 0);
	public static final Item FROZEN_MALLET = new Item("Frozen Mallet", 700, 30, 0, 0, 0, 0, 0);
	public static final Item GUINSOOS_RAGEBLADE = new Item("Guinsoo's Rageblade", 0, 30, 0, 0 , 0, 0, 0);
	public static final Item HEXDRINKER = new Item("Hexdrinker", 0, 25, 0 , 0, 30, 0, 0);
	public static final Item HEXTECH_GUNBLADE = new Item("Hextech Gunblade", 0, 40, 0, 0, 0, 0, 0);
	public static final Item INFINITY_EDGE = new Item("Infinity Edge", 0, 80, 0 , 0, 0, 0, 0);
	public static final Item LAST_WHISPER = new Item("Last Whipser", 0 , 40, 0 , 0, 0, 0, 0.35);
	public static final Item LONG_SWORD = new Item("Long Sword", 0, 10, 0, 0, 0, 0, 0);
	public static final Item MANAMUNE = new Item("Manamune", 0, 30, 0, 0, 0, 0, 0);
	public static final Item MAW_OF_MALMORTIUS = new Item("Maw of Malmortius", 0, 60, 0, 0, 40, 0, 0);
	public static final Item MERCURIAL_SCIMITAR = new Item("Mercurial Scimitar", 0, 80, 0, 0, 35, 0, 0);
	public static final Item MURAMANA = new Item("Muramana", 0, 45, 0, 0, 0, 0, 0);
	public static final Item PHAGE = new Item("Phage", 200, 20, 0, 0, 0, 0, 0);
	public static final Item PICKAXE = new Item("Pickaxe", 0, 25, 0, 0, 0, 0, 0);
	public static final Item RAVENOUS_HYDRA = new Item("Ravenous Hydra", 0, 75, 0, 0, 0, 0, 0);
	public static final Item SWORD_OF_THE_OCCULT = new Item("Sword of the Occult", 0, 10, 0, 0, 0, 0, 0);
	public static final Item THE_BLACK_CLEAVER = new Item("The Black Cleaver", 200, 50, 0, 0, 0, 10, 0.05);
	public static final Item THE_BLOODTHIRSTER = new Item("The Brutalizer", 0, 80, 0, 0, 0, 0, 0);
	public static final Item THE_BRUTALIZER = new Item("The Brutalizer", 0, 25, 0, 0, 0, 10, 0);
	public static final Item TIAMAT = new Item("Tiamat", 0, 40, 0, 0, 0, 0, 0);
	public static final Item TRINITY_FORCE = new Item("Trinity Force", 250, 30, .3, 0, 0, 0, 0);
	public static final Item VAMPIRIC_SCEPTER = new Item("Vampiric Scepter", 0, 10, 0, 0, 0, 0, 0);
	public static final Item WARRIOR = new Item("Warrior (Enchantment)", 0, 45, 0, 0, 0, 10, 0);
	public static final Item YOUMUUS_GHOSTBLADE = new Item("Youmuu's Ghostblade", 0, 30, 0, 0, 0, 20, 0);
	public static final Item ZEKES_HERALD = new Item("Zeke's Herald", 250, 20, 0, 0, 0, 0, 0);
	public static final Item ZEPHYR = new Item("Zephyr", 0, 25, .5, 0, 0, 0, 0);
	
	
	//armor item
	public static final Item CLOTH_ARMOR = new Item("Cloth Armor", 0, 0, 0, 15	, 0, 0, 0);
	//wtf this shit doesnt give armor public static final Item BANNER_OF_COMMAND = new Item("Banner of Command", 200, 0, 0, )
	public static final Item CHAIN_VEST = new Item("Chain Veset", 0, 0, 0, 40, 0, 0, 0);
	public static final Item FROZEN_HEART = new Item("Frozen Heart", 0, 0, 0, 100, 0, 0, 0);
	public static final Item GLACIAL_SHROUD = new Item("Glacial Shroud", 0, 0, 0, 20, 0, 0, 0);
	public static final Item GUARDIAN_ANGEL = new Item("Guardian Angel", 0, 0, 0, 50, 50, 0, 0);
	public static final Item ICEBORN_GAUNTLET = new Item("Iceborn Gauntlet", 0, 0, 0, 60, 0, 0, 0);
	public static final Item NINJA_TABI = new Item("Ninja Tabi", 0, 0, 0, 25, 0, 0, 0);
	public static final Item RANDUINS_OMEN = new Item("Randuin's Omen", 500, 0, 0, 70, 0, 0, 0);
	public static final Item SEEKERS_ARMGUARD = new Item("Seeker's Amrguard", 0, 0, 0, 30, 0, 0, 0);
	public static final Item SUNFIRE_CAPE = new Item("Sunfire Cape", 450, 0, 0, 45, 0, 0, 0);
	public static final Item THORNMAIL = new Item("Thornmail", 0, 0, 0, 100, 0, 0, 0);
	public static final Item WARDENS_MAIL = new Item("Warden's Mail", 0, 0, 0, 45, 0, 0, 0);
	public static final Item ZHONYAS_HOURGLASS = new Item("Zhonya's Hourglass", 0, 0, 0, 50, 0, 0, 0);
	
	
	//other items?
	
}
