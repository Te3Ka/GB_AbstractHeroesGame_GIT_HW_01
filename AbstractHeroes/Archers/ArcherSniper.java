package AbstractHeroes.Archers;

public class ArcherSniper extends AbstractArchers {
	String special;
	
	public ArcherSniper(String name) {
		super(name, "Sniper", 25, 15, 3,
				20, 3, 10, 30);
		this.special = "Sniper Shoot";
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