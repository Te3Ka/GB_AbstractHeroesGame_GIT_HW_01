package AbstractHeroes.Healers;

public class HealersApothecary extends AbstractHealers {
	String special;
	
	public HealersApothecary(String name) {
		super(name, "Apothecary", 50, 1, 4,
				1, 11, 70, 15);
		this.special = "Fog of Healing";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max mana points: " + maxManaPoints);
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