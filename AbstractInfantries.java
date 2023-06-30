public abstract class AbstractInfantries extends AbstractHeroes {
	int maxRagePoints;
	int maxEnergyPoints;
	
	public AbstractInfantries(String nameHero, String typeHero, int maxHitPoints,
							  int damage, int armor, int rangeAttack, int initiative,
							  int maxRagePoints, int maxEnergyPoints) {
		super(nameHero, typeHero, maxHitPoints, damage, armor, rangeAttack, initiative);
		this.maxRagePoints = maxRagePoints;
		this.maxEnergyPoints = maxEnergyPoints;
	}
}