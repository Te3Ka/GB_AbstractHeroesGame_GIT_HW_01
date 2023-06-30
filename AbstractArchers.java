public abstract class AbstractArchers extends AbstractHeroes {
	int arrows;
	int maxEnergyPoints;
	
	public AbstractArchers(String nameHero, String typeHero, int maxHitPoints,
							int damage, int armor, int rangeAttack, int initiative,
							int arrows, int maxEnergyPoints) {
		super(nameHero, typeHero, maxHitPoints, damage, armor, rangeAttack, initiative);
		this.arrows = arrows;
		this.maxEnergyPoints = maxEnergyPoints;
	}
}