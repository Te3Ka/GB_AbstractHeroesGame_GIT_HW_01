package AbstractHeroes.Healers;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractHealers extends AbstractHeroes {
    int maxManaPoints;
    int healing;

    public AbstractHealers(String nameHero, String typeHero, int maxHitPoints,
                           int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                           int maxManaPoints, int healing, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxManaPoints = maxManaPoints;
        this.healing = healing;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies, ArrayList<AbstractHeroes> allies) {
        super.findNearestEnemy(enemies);
    }
}