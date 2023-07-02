package AbstractHeroes.Supports;

import AbstractHeroes.AbstractHeroes;

public abstract class AbstractSupports extends AbstractHeroes {
	int maxEnergyPoints;
	int maxSupportPoints;
	
	public AbstractSupports(String nameHero, String typeHero, int maxHitPoints,
							int damage, int armor, int rangeAttack, int initiative,
							int maxEnergyPoints, int maxSupportPoints) {
		super(nameHero, typeHero, maxHitPoints, damage, armor, rangeAttack, initiative);
		this.maxEnergyPoints = maxEnergyPoints;
		this.maxSupportPoints = maxSupportPoints;
	}
}