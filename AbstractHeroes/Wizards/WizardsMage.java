package AbstractHeroes.Wizards;

public class WizardsMage extends AbstractWizards {
	String[] spells;
	
	public WizardsMage(String name, int coorX, int coorY) {
		super(name, "Mage", 30, 1, 5, 2,
				4, 12, 200, 8, coorX, coorY);
		this.spells = new String[8];
		this.spells[0] = "Teleport";
		this.spells[1] = "Fireball";
		this.spells[2] = "Iceball";
		this.spells[3] = "Air spear";
		this.spells[4] = "Earthquake";
		this.spells[5] = "Wizard armor";
		this.spells[6] = "Reinforcement";
		this.spells[7] = "Invisible";

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