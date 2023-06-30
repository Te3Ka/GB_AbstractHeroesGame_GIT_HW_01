public abstract class AbstractHeroes {
	String nameHero;
	String typeHero;
	int maxHitPoints;
	int damage;
	int armor;
	int rangeAttack;
	int initiative;
	
	public AbstractHeroes (String nameHero, String typeHero, int maxHitPoints,
						int damage, int armor, int rangeAttack, int initiative) {
		this.nameHero = nameHero;
		this.typeHero = typeHero;
		this.maxHitPoints = maxHitPoints;
		this.damage = damage;
		this.armor = armor;
		this.rangeAttack = rangeAttack;
		this.initiative = initiative;
	}
}