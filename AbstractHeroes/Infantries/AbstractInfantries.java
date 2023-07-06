package AbstractHeroes.Infantries;

import AbstractHeroes.AbstractHeroes;

import java.util.ArrayList;

public abstract class AbstractInfantries extends AbstractHeroes {
    int maxRagePoints;
    int maxEnergyPoints;

    public AbstractInfantries(String nameHero, String typeHero, int maxHitPoints,
                              int minDamage, int maxDamage, int armor, int rangeAttack, int initiative,
                              int maxRagePoints, int maxEnergyPoints, int coorX, int coorY) {
        super(nameHero, typeHero, maxHitPoints, minDamage, maxDamage,
                armor, rangeAttack, initiative, coorX, coorY);
        this.maxRagePoints = maxRagePoints;
        this.maxEnergyPoints = maxEnergyPoints;
    }

    @Override
    public void step(ArrayList<AbstractHeroes> enemies) {
        super.findNearestEnemy(enemies);
    }
}