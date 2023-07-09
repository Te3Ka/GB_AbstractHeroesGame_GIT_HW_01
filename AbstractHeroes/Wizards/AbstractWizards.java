package AbstractHeroes.Wizards;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractWizards extends AbstractHeroes {
	int maxMana;
	int numSpells;
	
	public AbstractWizards(String nameHero, String typeHero, int maxHitPoints,
							int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
							int maxMana, int numSpells, int coorX, int coorY) {
		super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
				armor, rangeAttack, initiative, coorX, coorY);
		this.maxMana = maxMana;
		this.numSpells = numSpells;
	}

	@Override
	public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
		super.findNearestEnemy(enemies);
	}
}