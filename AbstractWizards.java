public abstract class AbstractWizards extends AbstractHeroes {
	int maxMana;
	int numSpells;
	
	public AbstractWizards(String nameHero, String typeHero, int maxHitPoints,
							int damage, int armor, int rangeAttack, int initiative,
							int maxMana, int numSpells) {
		super(nameHero, typeHero, maxHitPoints, damage, armor, rangeAttack, initiative);
		this.maxMana = maxMana;
		this.numSpells = numSpells;
	}
}