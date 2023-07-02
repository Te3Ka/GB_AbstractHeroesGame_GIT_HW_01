package AbstractHeroes;

public abstract class AbstractHeroes implements InGame{
	protected String nameHero;
	protected String typeHero;
	protected int maxHitPoints, currentHitPoints;
	protected int damage;
	protected int armor;
	protected int rangeAttack;
	protected int initiative;
	
	public AbstractHeroes (String nameHero, String typeHero, int maxHitPoints,
						int damage, int armor, int rangeAttack, int initiative) {
		this.nameHero = nameHero;
		this.typeHero = typeHero;
		this.maxHitPoints = this.currentHitPoints = maxHitPoints;
		this.damage = damage;
		this.armor = armor;
		this.rangeAttack = rangeAttack;
		this.initiative = initiative;
	}

	public String getTypeHero() {
		return nameHero + " " + typeHero;
	}
}