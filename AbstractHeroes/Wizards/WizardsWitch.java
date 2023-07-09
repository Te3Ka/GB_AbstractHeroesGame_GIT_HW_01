package AbstractHeroes.Wizards;

public class WizardsWitch extends AbstractWizards {
	String[] spells;
	
	public WizardsWitch(String name, int coorX, int coorY) {
		super(name, "Witch", 40, 1, 3, 1,
				5, 4, 100, 4, coorX, coorY);
		this.spells = new String[4];
		this.spells[0] = "Bat flight";
		this.spells[1] = "Vampire bite";
		this.spells[2] = "Weakening";
		this.spells[3] = "Lightning";
	}

	public void printParameters() {
		System.out.println("Type hero: " + typeHero);
		System.out.println("Name hero: " + nameHero);
		System.out.println("Max hit points: " + maxHitPoints);
		System.out.println("Max mana points: " + maxMana);
		System.out.println("Damage: " + maxDamage);
		System.out.println("Armor: " + armor);
		System.out.println("Range attack: " + rangeAttack);
		System.out.println("Initiative: " + initiative);
		System.out.println("Spells:");
		for (int i = 0; i < spells.length; i++) {
			System.out.println(">> Spell #" + (i + 1) + ": " + spells[i]);
		}
		System.out.println("Position: X: " + coorX() + " Y: " + coorY());
	}
}