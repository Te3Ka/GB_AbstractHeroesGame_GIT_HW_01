public class SupportPeasant extends AbstractSupports {
	String special;
	
	public SupportPeasant(String name) {
		super(name, "Peasant", 80, 2, 6,
				1, 6, 20, 20);
		this.special = "Running";
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