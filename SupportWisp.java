public class SupportWisp extends AbstractSupports {
	String special;
	
	public SupportWisp(String name) {
		super(name, "Wisp", 10, 1, 20,
				1, 4, 200, 10);
		this.special = "Blink";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
		System.out.println("Max support points: " + maxSupportPoints);
		System.out.println("Damage: " + damage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
	}
}