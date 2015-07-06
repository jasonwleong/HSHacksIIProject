import java.util.Scanner;

public class Main {
	
	//so these methods should be placed as either a separate fragment or as a part of the MainActivity
	//as the logic behind the code
	
	//remeber to remove static shit when moving code - only static bc shit written in main requries static
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Champion randomChamp = ListOfADCS.ASHE;
		Champion attackingChamp = ListOfADCS.CAITLYN;
		Champion defendingChamp = ListOfADCS.LUCIAN;
		attackingChamp.items.add(ListOfItems.LONG_SWORD);
		attackingChamp.items.add(ListOfItems.LONG_SWORD);
		attackingChamp.items.add(ListOfItems.THE_BRUTALIZER);
		attackingChamp.items.add(ListOfItems.LAST_WHISPER);
		defendingChamp.items.add(ListOfItems.CLOTH_ARMOR);
		defendingChamp.items.add(ListOfItems.CLOTH_ARMOR);
		defendingChamp.items.add(ListOfItems.CLOTH_ARMOR);
		defendingChamp.items.add(ListOfItems.CHAIN_VEST);
		
		
		
		System.out.println("base attack = " + attackingChamp.getBaseAD());
		System.out.println("total attack = " + attackingChamp.getTotalAD());
		System.out.println("total defense = " + defendingChamp.getTotalArmor());
		
		System.out.println("Running damage calculator on " + attackingChamp.name + " attacking " + defendingChamp.name);
		System.out.println("Damage Done = " + amountOfDamageDone(attackingChamp, defendingChamp));
		
		
	}
	
	/**
	 * This method takes in 2 parameters. The first champion is the attacking champion and the
	 * second is the champion receiving the autoattack. This returns a double that is the value
	 * for the amount of damage the defending champion will receive for one auto attack
	 * after all armor and penetration is accounted for.
	 * 
	 * @param attChamp
	 * @param defChamp
	 * @return damageDone
	 */
	
	public static double amountOfDamageDone(Champion attChamp, Champion defChamp){
		double damageDone = 0;
		double defChampArmor = defChamp.getTotalArmor() * (1 - attChamp.getAPenPercentage());
		System.out.println("attack champ apen percent = " + attChamp.getAPenPercentage());
		System.out.println("defending champion armor after percent pen = " + defChampArmor);
		defChampArmor = defChampArmor - attChamp.getTotalFlatAPen();
		System.out.println("defChampArmor after flatAPEN " + defChampArmor);
		damageDone = attChamp.getTotalAD() * (100 / (100 + defChampArmor));
		return damageDone;
		
	}
	
	public static double amountOfDamagePerSecond(Champion attChamp, Champion defChamp) {
		return amountOfDamageDone(attChamp, defChamp) * attChamp.getTotalAS();
	}
	
	public static double amountOfDPSWithCrit(Champion attChamp, Champion defChamp) {
		for (int i = 0; i < attChamp.items.size(); i ++) {
			if (attChamp.items.contains(ListOfItems.INFINITY_EDGE)) {
				return amountOfDamagePerSecond(attChamp, defChamp) * 2.0;
			}
		}
		return amountOfDamagePerSecond(attChamp, defChamp) * 1.5;
	}
	
	
}
