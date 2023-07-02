package AbstractHeroes.Healers;

import AbstractHeroes.AbstractHeroes;

public abstract class AbstractHealers extends AbstractHeroes {
	int maxManaPoints;
	int healing;
	
	public AbstractHealers(String nameHero, String typeHero, int maxHitPoints,
						   int damage, int armor, int rangeAttack, int initiative,
						   int maxManaPoints, int healing) {
		super(nameHero, typeHero, maxHitPoints, damage, armor, rangeAttack, initiative);
		this.maxManaPoints = maxManaPoints;
		this.healing = healing;
	}
}