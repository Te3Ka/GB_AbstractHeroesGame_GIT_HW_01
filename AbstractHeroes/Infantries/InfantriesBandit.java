package AbstractHeroes.Infantries;

public class InfantriesBandit extends AbstractInfantries {
	String special;
	
	public InfantriesBandit(String name) {
		super(name, "Bandit", 50, 20, 8,
				1, 15, 20, 50);
		this.special = "Dodging an attack";
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