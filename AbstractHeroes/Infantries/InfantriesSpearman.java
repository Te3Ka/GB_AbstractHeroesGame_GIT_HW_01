package AbstractHeroes.Infantries;

public class InfantriesSpearman extends AbstractInfantries {
	String special;
	
	public InfantriesSpearman(String name) {
		super(name, "Spearman", 40, 30, 15,
				2, 10, 40, 30);
		this.special = "Spear puncture";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
		System.out.println("Max rage points: " + maxRagePoints);
		System.out.println("Damage: " + damage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
	}

	@Override
	public void step() {

	}
}