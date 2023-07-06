package AbstractHeroes.Archers;

public class ArchersSniper extends AbstractArchers {
	String special;
	
	public ArchersSniper(String name, int coorX, int coorY) {
		super(name, "Sniper", 25, 10, 15, 3,
				20, 3, 10, 30, coorX, coorY);
		this.special = "Sniper Shoot";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max energy points: " + maxEnergyPoints);
		System.out.println("Damage: " + maxDamage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Special movement: " + special);
		System.out.println("Position: X: " + coorX() + " Y: " + coorY());
	}
}