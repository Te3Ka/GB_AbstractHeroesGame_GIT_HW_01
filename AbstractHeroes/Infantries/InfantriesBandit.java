package AbstractHeroes.Infantries;

public class InfantriesBandit extends AbstractInfantries {
	String special;
	
	public InfantriesBandit(String name, int coorX, int coorY) {
		super(name, "Bandit", 50, 10, 20, 0,
				1, 10, 20, 50, coorX, coorY);
		this.special = "Dodging an attack";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
		System.out.println("Max rage points: " + maxRagePoints);
		System.out.println("Damage: " + maxDamage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
		System.out.println("Position: X: " + coorX() + " Y: " + coorY());

	}
}