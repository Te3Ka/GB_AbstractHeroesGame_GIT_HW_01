package AbstractHeroes.Archers;

public class ArcherCrossbowman extends AbstractArchers {
	protected String special;
	
	public ArcherCrossbowman(String name) {
		super(name, "Crossbowman", 40, 30, 10,
				10, 2, 5, 15);
		this.special = "Fast reload";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
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