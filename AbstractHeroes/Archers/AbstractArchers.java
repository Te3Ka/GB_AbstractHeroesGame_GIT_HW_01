package AbstractHeroes.Archers;

import AbstractHeroes.AbstractHeroes;

public abstract class AbstractArchers extends AbstractHeroes {
	protected int maxArrows, currentArrows;
	protected int maxEnergyPoints, currentEnergyPoints;
	
	public AbstractArchers(String nameHero, String typeHero, int maxHitPoints,
						   int damage, int armor, int rangeAttack, int initiative,
						   int maxArrows, int maxEnergyPoints) {
		super(nameHero, typeHero, maxHitPoints, damage, armor, rangeAttack, initiative);
		this.maxArrows = this.currentArrows = maxArrows;
		this.maxEnergyPoints = this.currentEnergyPoints = maxEnergyPoints;
	}
}